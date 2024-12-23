public class Triangulo extends Figura
{
    private double base;
    private double altura;


    public Triangulo(double b, double h)
    {
        this.base = b;
        this.altura = h;
    }

    @Override
    public double calcularPerimetro()
    {
        return base +  2 * Math.sqrt(base *  base / 4 + altura * altura);
    }

    @Override
    public double calcularArea()
    {
        return 0.5d * base * altura ;
    }

}