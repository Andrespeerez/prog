import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i;
        System.out.print("Introduzca un valor o -1 para salir: ");

        i = scanner.nextDouble();
        for ( ; ; ) {
            if( i < 0.0 )
            {
                break;
            }
            System.out.println("La raíz cuadrada de " + i + " es " +
                    Math.sqrt(i));
            System.out.print("Introduzca un valor o -1 para salir: ");
            i = scanner.nextDouble();
        }

    }
}
