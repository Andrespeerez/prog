import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*****       Menú del restaurante:     *****");
        System.out.println("***** 1. Spaghetti Carbonara          *****");
        System.out.print("\n\nEscribe un número: ");

        try {
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Opción valida: Spaghetti Carbonara");
                    break;
                default:
                    System.out.println("Opcion valida: " + opcion);
            }

        } catch (InputMismatchException e)
        {
            System.out.println("Solo se permiten números");
        }
    }
}
