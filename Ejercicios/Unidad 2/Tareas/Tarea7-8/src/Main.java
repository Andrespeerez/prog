public class Main
{
    public static void main(String[] args) {

        final int CANTIDAD_PRIMOS = 50;
        int number = 1;

        bucleNumerosPrimos:
        for (int count = 0; count <= CANTIDAD_PRIMOS; )
        {
            number += 1;

            // Ningún número par es primo excepto 2
            if ( (number % 2 == 0) && (number != 2)) continue;

            for (int j = 2; j < number ; j++)
            {
                if ( number % j == 0)
                {
                    continue bucleNumerosPrimos;
                }
            }

            count++;
            System.out.println("Primo: "+ number);

        }
    }
}
