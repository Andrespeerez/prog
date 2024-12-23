public class SpeedConverter
{
    public static void main(String[] args) {
        printConversion(10.5d);
    }

    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0.0d) {
            return -1L;
        }
        double factorConversion = 1 / 1.609d;
        double milesPerHour = kilometersPerHour * factorConversion;
        return Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour)
    {
        if (kilometersPerHour < 0.0d)
        {
            System.out.println("Valor inválido");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
