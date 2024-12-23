public class Calculadora
{
    public static int sumar (int a, int b)
    {
        return a + b;
    }

    public static int restar (int a, int b)
    {
        return a - b;
    }

    public static int multiplicar (int a, int b)
    {
        return a * b;
    }

    public static int dividir (int a, int b)
    {
        if (b == 0)
        {
            System.err.println("Error: No se puede dividir por cero.");
            return 0;
        }

        return a / b;
    }
}

