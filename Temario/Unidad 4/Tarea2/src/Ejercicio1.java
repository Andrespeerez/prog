import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] array;
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es el tamaño del array? ");
        int size = sc.nextInt();

        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Inserta un entero: ");
            array[i] = sc.nextInt();
        }

    }
}
