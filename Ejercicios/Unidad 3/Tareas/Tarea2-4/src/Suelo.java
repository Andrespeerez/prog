public class Suelo
{
    private double ancho;
    private double largo;

    public Suelo(double ancho, double largo)
    {
        this.ancho = (ancho > 0) ? ancho : 0;
        this.largo = (largo > 0) ? largo : 0;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setAncho(double ancho) {
        this.ancho = (ancho > 0) ? ancho : 0;
    }

    public void setLargo(double largo) {
        this.largo = (largo > 0) ? largo : 0;
    }

    public double getArea()
    {
        return ancho * largo;
    }
}
