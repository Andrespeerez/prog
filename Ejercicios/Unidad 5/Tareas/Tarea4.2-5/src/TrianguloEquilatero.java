public class TrianguloEquilatero implements ShapeOperable {

    double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro() {
        return 3 * this.lado;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * this.lado * this.lado;
    }

}
