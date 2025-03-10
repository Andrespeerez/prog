public class Calculadora
{
    private Suelo suelo;
    private Alfombra alfombra;

    public Calculadora(Suelo suelo, Alfombra alfombra)
    {
        this.suelo = suelo;
        this.alfombra = alfombra;
    }

    public double getCosteTotal()
    {
        return suelo.getArea() * alfombra.getCoste();
    }
}
