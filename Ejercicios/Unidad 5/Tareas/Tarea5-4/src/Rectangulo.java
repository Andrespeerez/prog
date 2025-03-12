public class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo> {

    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        super(4);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return this.ancho * this.alto;
    }

    @Override
    public double getPerimeter() {
        return this.alto * 2 + this.ancho * 2;
    }

    @Override
    public void redimensionar(int x) {
        this.ancho = this.ancho * x;
        this.alto = this.alto * x;
    }

    @Override
    public int compareTo(Rectangulo o) {
        if (this.getArea() < o.getArea()) return -1;
        else if (this.getArea() > o.getArea()) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Rectángulo ("+this.ancho + "x"+this.alto+") - Area: "+this.getArea();
    }
}
