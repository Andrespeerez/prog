public class Muro
{
    private double ancho;
    private double alto;

    public Muro()
    {
        this(0, 0);
    }

    public Muro(double ancho, double alto)
    {
        this.alto = (alto >= 0) ? alto : 0;
        this.ancho = (ancho >= 0) ? ancho : 0;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = (alto >= 0 ) ? alto : 0;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = (ancho >= 0 ) ? ancho : 0;
    }

    public double getArea()
    {
        return ancho * alto;
    }
}
