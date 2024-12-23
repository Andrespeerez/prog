public class Rectangulo extends Figura
{
    private double lado1;
    private double lado2;


    public Rectangulo(double l)
    {
        this.lado1 = l;
        this.lado2 = l;
    }

    public Rectangulo(double l1, double l2)
    {
        this.lado1 = l1;
        this.lado2 = l2;
    }

    @Override
    public double calcularPerimetro()
    {
        return 2*( lado1 + lado2 );
    }

    @Override
    public double calcularArea()
    {
        return lado1 * lado2;
    }

}