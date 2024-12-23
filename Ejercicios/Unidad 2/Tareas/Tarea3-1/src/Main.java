import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor de inicio y un valor límite:  ");

        int contador = sc.nextInt();
        int limite = sc.nextInt();

        while(contador <= limite)
        {
            System.out.println("Contador es: " + contador );
            contador = contador + 1;
        }

        System.out.println("Termina el bucle");
    }
}
