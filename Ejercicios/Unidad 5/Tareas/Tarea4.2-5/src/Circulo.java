public class Circulo implements ShapeOperable {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return 2 * PI * this.radio;
    }

    @Override
    public double area() {
        return PI * this.radio * this.radio;
    }
}
