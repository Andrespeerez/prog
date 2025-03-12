public class Triangulo extends Forma {

    private double ancho;
    private double alto;

    public Triangulo(double ancho, double alto) {
        super(3);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return this.ancho * this.alto / 2;
    }

    @Override
    public double getPerimeter() {
        return this.ancho * 3;
    }
}
