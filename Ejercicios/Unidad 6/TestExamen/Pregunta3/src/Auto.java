public class Auto extends Vehiculo implements Conducible {

    private int numPuertas;
    private Motor motor; // pregunta 4

    public Auto(String marca, String modelo, int anyo, int numPuertas, int potencia, TipoCombustible combustible) {
        super(marca, modelo, anyo);

        Motor motor = new Motor(potencia, combustible);

        this.numPuertas = numPuertas;
        this.motor = motor;
    }

    // pregunta 5
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero Puertas: " + this.numPuertas);
        System.out.println("Potencia: " + this.motor.getPotencia());
        System.out.println("Tipo Combustible: " + this.motor.getTipoCombustible());
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    // pregunta 6
    @Override
    public void acelerar() {
        System.out.println("El " + this.getMarca() +
                " acelera con una potencia de " + this.motor.getPotencia() +
                " caballos");
    }

    @Override
    public void frenar() {
        System.out.println("El coche frenaaa!");
    }


}
