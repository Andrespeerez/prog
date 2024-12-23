import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        try {
            System.out.print("Dame un número: ");
            int x = sc.nextInt();

            if (x < 0)
            {
                throw new ArithmeticException("ERROR: valor negativo en la coordenada X");
            }
        } catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
