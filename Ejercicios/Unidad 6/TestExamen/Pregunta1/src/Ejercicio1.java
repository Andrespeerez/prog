import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] enteros = new int[10];

        generarNumeros(enteros);
        pintarNumeros(enteros);

        System.out.print("Dame un valor para buscar: ");
        Scanner sc = new Scanner(System.in);
        int miValor = sc.nextInt();
        sc.close();

        System.out.println(
                encontrarNumero(enteros, miValor)
        );



    }

    private static void generarNumeros(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
    }

    private static void pintarNumeros(int[] array) {
        for(int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    private static boolean encontrarNumero(int[] array, int valor) {
        for (int i = 0; i < array.length; i++ ) {
            if(array[i] == valor) return true;
        }

        return false;
    }
}
