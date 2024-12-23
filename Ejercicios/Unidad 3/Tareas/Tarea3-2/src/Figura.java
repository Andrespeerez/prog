public class Figura
{

    public static double area (double radio)
    {
        if (radio < 0) return -1;

        return Math.PI * radio * radio;
    }

    public static double area (double x, double y)
    {
        if (x < 0 || y < 0) return -1;

        return x * y;
    }

    // area de un trapecio
    public static double area (double baseGrande, double basePequeña, double altura)
    {
        if (baseGrande < 0 || altura < 0 || basePequeña < 0) return -1;

        return (baseGrande + basePequeña) * altura * 0.5;
    }
}
