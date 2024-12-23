public class Alfombra
{
    private double coste;

    public Alfombra(double coste)
    {
        this.coste = (coste > 0) ? coste : 0;
    }

    public double getCoste() {
        return coste;
    }
}
