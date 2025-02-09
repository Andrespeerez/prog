public class BinarySearch {

    public static void main(String[] args) {

        int[] myArray = new int[14];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 2 + 2 * i;
        }

        Sort.print(myArray);

        int valor = 6;
        int indice = binarySearch(valor, myArray);
        System.out.println("Indice de " + valor + ": " + indice);

        int indice2 = recursiveBinarySearch(valor, myArray);
        System.out.println("Indice de " + valor + ": " + indice2);
    }

    public static int binarySearch(int valor, int[] array) {

        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(array[mid] == valor) return mid; // valor encontrado, devuelve el índice


            if (array[mid] > valor) high = mid - 1; // acota por arriba
            if (array[mid] < valor) low = mid + 1; // acota por abajo

        }

        return -1;
    }

    // Metodo publico
    // Inicializa low y high para el metodo recursivo real
    public static int recursiveBinarySearch(int valor, int[] array) {
        return _recursiveBinarySearch(0, array.length - 1, valor, array);
    }

    // Metodo recursivo
    private static int _recursiveBinarySearch(int low, int high, int valor, int[] array) {

        if (high < low) return -1; // caso base

        int mid = low + (high - low) / 2;

        if (array[mid] == valor) return mid; // valor encontrado

        // llamadas recursivas
        else if (valor > array[mid]) {
            return _recursiveBinarySearch(mid + 1, high, valor, array);
        } else if (valor < array[mid]) {
            return _recursiveBinarySearch(low, mid - 1, valor, array);
        }

        return -2; // no debería de ejecutarse
    }

}
