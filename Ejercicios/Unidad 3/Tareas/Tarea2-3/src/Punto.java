public class Punto
{
    private int x;
    private int y;

    public Punto()
    {
        this(0,0);
    }

    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia()
    {
        return Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double distancia(int x, int y)
    {
        return Math.sqrt( Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distancia(Punto punto)
    {
        return Math.sqrt( Math.pow(this.x - punto.x, 2) + Math.pow(this.y - punto.y, 2));
    }
}
