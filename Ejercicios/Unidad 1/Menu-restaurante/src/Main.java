import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(
                "\n*****         MENÚ DE SELECCIÓN                    *****"+
                "\n***** 1. Añadir un entrante.                       *****"+
                "\n***** 2. Añadir un plato principal.                *****"+
                "\n***** 3. Elegir postre.                            *****"+
                "\n***** 4. No sentarme en este restaurante porque... *****"+
                "\n\nElige una opción: ");

        byte opcion = sc.nextByte();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("\nAñadiendo entrante.");
                break;
            case 2:
                System.out.println("\nAñadiendo plato principal.");
                break;
            case 3:
                System.out.println("\nAñadiendo postre.");
                break;
            case 4:
                System.out.println("\nDinos porque.");
                String motivo = sc.nextLine();
                System.out.println(motivo);
                break;
            default:
                System.out.println("\nOpción desconocida.");
        }


    }
}
