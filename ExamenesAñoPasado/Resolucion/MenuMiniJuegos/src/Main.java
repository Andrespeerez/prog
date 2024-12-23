import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean repetir = true;
        try {
            do {
                System.out.println("\n==MINIJUEGOS==" +
                        "\n1 - Adivinar Numeros" +
                        "\n2 - Tabla de Multiplicar" +
                        "\n3 - Convertir Celsius a Kelvin" +
                        "\n4 - Salir");
                System.out.println("Introduce un Número: ");
                int opcion = sc.nextInt();
                sc.nextLine();
                switch (opcion) {
                    case 1:
                        adivinarNumero();
                        break;
                    case 2:
                        tablaMultiplicar();
                        break;
                    case 3:
                        convertirCelsiusToKelvin();
                        break;
                    case 4:
                        System.out.println("Hasta luego!");
                        repetir = false;
                        break;
                    default:
                        System.out.println("Esa opción no existe, inténtalo de nuevo");
                }

            } while (repetir);
        } catch(InputMismatchException e) {
            throw new InputMismatchException("Error: Valor introducido no valido. Esperaba un número");
        }
    }


    public static void adivinarNumero() {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numero = random.nextInt(10) + 1;

        System.out.print("Dime un número del 1 al 10: ");
        int guess = sc.nextInt();

        if(numero == guess) System.out.println("Has ganado! " + numero + " = " + guess);
        else System.out.println("Perdiste! " + numero + " != " + guess);
    }

    public static void tablaMultiplicar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }

    public static void convertirCelsiusToKelvin() {
        Scanner sc = new Scanner(System.in);

        final double CONVERSION = 273.15d;

        System.out.print("Dime la temperatura en Celsius (ej. 25,5): ");
        double temperatura = sc.nextDouble();

        System.out.println("La temperatura es de " + (temperatura + CONVERSION) + "K");

    }
}
