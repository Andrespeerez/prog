import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elige el helado que más que guste:");
        System.out.println("0.- Helado de Vainilla");
        System.out.println("1.- Helado de Chocolate");
        System.out.println("2.- Helado de Fresa");

        System.out.print("Qué eliges? : ");

        byte eleccion = sc.nextByte();
        sc.nextLine();

        switch (eleccion)
        {
            case 0:
                System.out.println("Has seleccionado el helado de Vainilla");
                break;
            case 1:
                System.out.println("Has seleccionado el helado de Chocolate");
                break;
            case 2:
                System.out.println("Has seleccionado el helado de Fresa");
                break;
            default:
                System.err.println("Error");
        }

    }
}
