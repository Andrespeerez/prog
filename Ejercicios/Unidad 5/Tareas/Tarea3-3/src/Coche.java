public class Coche {

    private String modelo;
    private int cilindros;
    private boolean motor;
    private int ruedas;

    public Coche(String modelo, int cilindros) {
        this.modelo = modelo;
        this.cilindros = cilindros;
        this.motor = true;
        this.ruedas = 4;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getCilindros() {
        return this.cilindros;
    }

    public boolean hasMotor() {
        return this.motor;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void arrancar() {
        System.out.println("El " + this.modelo + " arranca");
    }

    public void acelera() {
        System.out.println("El " + this.modelo + " acelera");
    }

    public void frenar() {
        System.out.println("El " + this.modelo + " se frena");
    }

}
