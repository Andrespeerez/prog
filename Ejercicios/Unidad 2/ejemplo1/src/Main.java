import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Esta lloviendo? (Y o N) ");
            String frase = sc.nextLine();

            if (frase.toUpperCase().equals("Y")) {
                System.out.println("Activa el limpiaparabrisas");
            } else if (frase.toUpperCase().equals("N")) {
                System.out.println("Desactiva el limpiaparabrisas");
            } else {
                System.out.println("Dejo de preguntar\nAdios!");
                break;
            }
        }
    }
}
