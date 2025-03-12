public class Pintura {

    private double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double cantidadPintura(Forma forma) {
        return forma.getArea() / this.cobertura;
    }
}
