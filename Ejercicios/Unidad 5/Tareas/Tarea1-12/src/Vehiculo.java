public class Vehiculo {

    private String nombre;
    private int ruedas;
    private Marcha marchaActual;
    private double velocidad;

    private double[] posicion = new double[3];
    private double[] direccion = new double[3];

    public Vehiculo() {
        this("undefined");
    }

    public Vehiculo(String nombre) {
        this.nombre = nombre;
        this.ruedas = 4;
        this.marchaActual = Marcha.PUNTO_MUERTO;

    }

    public Vehiculo(String nombre, int ruedas) {
        this.nombre = nombre;
        this.ruedas = ruedas;
        this.marchaActual = Marcha.PUNTO_MUERTO;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public double[] getPosicion() {
        return this.posicion;
    }

    public double[] getDireccion() {
        return this.direccion;
    }

    public void mover() {
        System.out.println("El vehículo se mueve");

        for (int i = 0; i < this.posicion.length; i++) {
            this.posicion[i] += velocidad * this.direccion[i];
        }
    }

    public void girar(double[] giro) {
        if(giro.length != 3) return;

        for (int i = 0; i < this.direccion.length; i++) {
            this.direccion[i] += giro[i];
        }

        // Normalizar la dirección después del giro
        double magnitud = Math.sqrt(
                direccion[0] * direccion[0] +
                        direccion[1] * direccion[1] +
                        direccion[2] * direccion[2]
        );

        for (int i = 0; i < this.direccion.length; i++) {
            this.direccion[i] /= magnitud;
        }
        System.out.println("El vehículo ha cambiado de dirección.");
    }

    public void acelerar(double incremento) {
        this.velocidad += incremento;
    }

    public void frenar(double incremento) {
        this.velocidad -= incremento;
    }


}
