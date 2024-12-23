import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos valores");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Límite de la serie");
        final int LIMITE = sc.nextInt();

        int contador = 2;
        int numTemp = 0;
        System.out.print(num1 + " " + num2 + " ");
        while (contador < LIMITE)
        {
            numTemp = num1 + num2;
            num1 = num2;
            num2 = numTemp;
            System.out.print(num2 + " ");

            contador++;
        }

    }
}
