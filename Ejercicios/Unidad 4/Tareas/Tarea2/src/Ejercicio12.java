import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Introduce un número: ");
            array[i] = sc.nextInt();
        }

        int[] arrayOrdenado = ordenarArray(array);

        imprimirArray(arrayOrdenado);
    }

    public static int[] ordenarArray(int[] array) {
        int[] arrayOrdenado = array.clone();

        /*
        Bubble sort: Los elementos burbujean a la superficie

        El algoritmo mira elemento a elemento si el elemento actual y el siguiente elemento estar ordenador,
        si el primero es mayor que el segundo, los invierte en posiciones. El proceso se repite hasta que el
        algoritmo termina el proceso sin realizar ningún cambio dentro del algoritmo
         */

        boolean hayCambios = false;
        do {
            hayCambios = false;

            for (int i = 0; i < arrayOrdenado.length - 1; i++) { // length - 1 porque revisamos a pares
                // Si elemento es mayor que el siguiente
                if(arrayOrdenado[i] > arrayOrdenado[ i + 1]) {
                    //invertimos el orden
                    int temp = arrayOrdenado[i];
                    arrayOrdenado[i] = arrayOrdenado[i + 1];
                    arrayOrdenado[i + 1] = temp;

                    hayCambios = true;
                }
            }

        }
        while (hayCambios); // mientras se produzcan cambios, seguimos iterando



        return arrayOrdenado;
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
