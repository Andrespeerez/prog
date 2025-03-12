public class Rectangulo extends Forma {

    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho) {
        super("Rectangulo");
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return this.alto * this.ancho;
    }
}
