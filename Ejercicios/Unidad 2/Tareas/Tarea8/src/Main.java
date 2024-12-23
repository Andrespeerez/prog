public class Main
{
    public static void main(String[] args)
    {

        try {
            double d = Math.random();
            if (d > 0.95d)
                throw new ArithmeticException(d + " está fuera de rango");
            System.out.println("El número es " + d);

            double j = Math.random();
            if (j > 0.5d)
                throw new ArithmeticException(j + " está fuera de rango");
            System.out.println("El número es " + j);
        } catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
