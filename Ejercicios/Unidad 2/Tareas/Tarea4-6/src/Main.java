import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        int contador = 1;

        do {
            System.out.println(numero + " x " + contador + " = " + numero * contador);
            contador = contador + 1;
        } while (contador <= 10);
    }
}
