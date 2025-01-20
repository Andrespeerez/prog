import java.util.Scanner;

public class ArrayTester {

    public static void main(String[] args) {

        int[] myArray = leerEnteros();
        imprimirArray(myArray);
        int[] myArrayTransformado = transformarArray(myArray);
        imprimirArray(myArrayTransformado);

    }

    /*
    Los arrays no pueden ser modificados en tamaño una vez se crean, por tanto, necesitamos crear un sistema que nos
    permita incrementar el tamaño a medida que introducimos nuevos datos.

    No nos queda de otra que trabajar con un array temporal que permita almacenar la información de nuestro array,
    mientras nosotros borramos el array para poder declararlo con un tamaño mayor. Luego, volvamos la información del
    array temporal en el definitivo y añadimos el nuevo último valor a nuestro array. De forma sucesiva vamos repitiendo
    el proceso hasta que terminemos de introducir números en el array

     */

    public static int[] leerEnteros() {
        Scanner sc = new Scanner(System.in);

        int[] arrayTemp;
        int[] array = new int[1];

        for( int i = 0; ; i++) {
            System.out.print("Introduce un entero (-1 para salir): ");
            int input = sc.nextInt();

            if(input == -1) break;

            arrayTemp = new int[i + 1];

            for (int j = 0; j < array.length; j++) {
                arrayTemp[j] = array[j];
            }

            arrayTemp[i] = input;

            array = arrayTemp;

        }

        return array;
    }

    public static void imprimirArray(int[] array) {
        System.out.print("[");
        for( int i = 0; i < array.length; i++) {
            if(i != array.length - 1) System.out.print(array[i] + ", ");
            if(i == array.length - 1) System.out.print(array[i]);
        }
        System.out.print("]\n");
    }

    public static int[] transformarArray(int[] array) {
        int[] arrayTransformado = array.clone();

        for (int i = 0; i < arrayTransformado.length; i++) {
            if(array[i] % 2 != 0) arrayTransformado[i] = -1;
        }

        return arrayTransformado;
    }
}
