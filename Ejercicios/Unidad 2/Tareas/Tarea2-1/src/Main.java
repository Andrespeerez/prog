import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int MIN_AGE = 21;
        final int MIN_CREDIT = 10_000;

        System.out.print("¿Qué edad tienes? (introduce un número)  ");
        int age = sc.nextInt();
        System.out.print("¿Cuanto credito tienes?: ");
        int credit = sc.nextInt();

        if ( (age >= MIN_AGE) || (credit >= MIN_CREDIT))
        {
            System.out.println("Eres apto para alquilar un vehículo.");
        } else {
            System.out.println("No puedes alquilar.");
        }
    }
}
