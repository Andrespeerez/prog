package Ejercicio2;

/**
 * Clase para realizar operaciones con arrays
 * @autor Andrés Pérez Guardiola
 */
public class ArrayOperations {

    private ArrayOperations() {}

    // A.

    /**
     * Muestra en terminal cada uno de los elementos del array de enteros especificado
     * @param array Array de entero a ser mostrados en pantalla
     */
    public static void print(int[] array) {

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i != array.length - 1) System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    // B.

    /**
     * Revierte los índices del array y devuelve otro array con los valores revertidos
     * @param array Array a revertir
     * @return Array con valores revertidos
     */
    public static int[] reverse(int[] array) {
        int[] arrayReverse = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayReverse[array.length - 1 - i] = array[i];
        }

        return arrayReverse;
    }

    // C.

    /**
     * Busca y devuelve el valor máximo dentro del array
     * @param array
     * @return Máximo
     */
    public static int max(int[] array) {
        int max = array[0];

        for (int value : array) {
            if (value > max) max = value;
        }

        return max;
    }

    // D.
    public static int min(int[] array) {
        int min = array[0];

        for(int value: array) {
            if(value < min) min = value;
        }

        return min;
    }

    // E.
    public static int sum(int[] array) {
        int sum = 0;

        for (int value: array){
            sum += value;
        }

        return sum;
    }

    // F.
    public static boolean equals(int[] src, int[] dst) {
        if( src.length != dst.length) return false;

        for(int i = 0; i < src.length; i++) {
            if(src[i] != dst[i]) return false;
        }

        return true;
    }

    // G.
    public static boolean equalsWithoutOrder(int[] src, int[] dst) {
        if( src.length != dst.length) return false;

        int[] srcTemp = ArrayOperations.copy(src);
        int[] dstTemp = ArrayOperations.copy(dst);

        ArrayOperations.sort(srcTemp);
        ArrayOperations.sort(dstTemp);

        for( int i = 0; i < src.length; i++) {
            if(srcTemp[i] != dstTemp[i]) return false;
        }

        return true;
    }

    // H.
    public static boolean isArrayOn(int[] src, int[] dst) {
        if(src.length > dst.length) return false;

        boolean[] arraySeguimiento = new boolean[dst.length];

        for (int value : src) {

            for (int i = 0; i < dst.length; i++) {
                if(arraySeguimiento[i]) continue;

                if(dst[i] == value) {
                    arraySeguimiento[i] = true;
                    break;
                }

                if(i == dst.length - 1)  return false;
            }

        }

        return true;
    }


    // I.
    public static void sort(int[] array) {

        boolean hayCambio;
        do {
            hayCambio = false;

            for (int i = 0; i < array.length - 1; i++) {
                if( array[i] > array[i + 1]) {
                    // Revertir valores
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    hayCambio = true;
                }
            }
        } while (hayCambio);
    }

    // J.
    public static int[] copy(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    // K.
    public static void removeOddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if( array[i] % 2 != 0)  array[i] = 0;
        }
    }

    // 3.
    public static void printRange(int[] array, int inicio, int fin) {
        if(fin >= array.length)  {
            throw new ArrayIndexOutOfBoundsException("El íncide X excede los límites del array");
        }

        System.out.print("[");
        for(int i = inicio; i < fin; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[fin] + "]");
    }

    // 5.
    public static int[] deleteOneDigitNumber(int[] array) {
        boolean[] arraySeguimiento = new boolean[array.length];
        int numeroValores = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] / 10 != 0) {
                arraySeguimiento[i] = true;
                numeroValores += 1;
            }
        }

        int[] outputArray = new int[numeroValores];
        int outputIndex = 0;

        for (int i = 0; i < arraySeguimiento.length; i++) {
            if (arraySeguimiento[i]) {
                outputArray[outputIndex] = array[i];
                outputIndex++;
            }
        }

        return outputArray;
    }

}
