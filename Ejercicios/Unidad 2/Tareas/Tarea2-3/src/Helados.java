import java.util.Scanner;

public class Helados
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        final int NUM_VAINILLA = 0;
        final int NUM_CHOCOLATE = 1;
        final int NUM_FRESA = 2;

        final String MENSAJE_HELADO = "Has escogido el helado de ";

        final String VAINILLA = "Vainilla";
        final String CHOCOLATE = "Chocolate";
        final String FRESA = "Fresa";


        System.out.println("***** Tenemos helados de  *****");
        System.out.println("*****  0. Vainilla        *****");
        System.out.println("*****  1. Chocolate       *****");
        System.out.println("*****  2. Fresa           *****");
        System.out.println();
        System.out.print("¿Qué helado te apetece tomar? ");
        int eleccion = sc.nextInt();


        switch (eleccion)
        {
            case NUM_VAINILLA:
                System.out.println(MENSAJE_HELADO + VAINILLA);
                break;
            case NUM_CHOCOLATE:
                System.out.println(MENSAJE_HELADO + CHOCOLATE);
                break;
            case NUM_FRESA:
                System.out.println(MENSAJE_HELADO + FRESA);
                break;
            default:
                System.out.println("No tengo ese sabor!");
        }

    }
}
