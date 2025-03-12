public class Ejercicio2 {

    public static void main(String[] args) {

        int[] enteros = new int[10];

        generarNumeros(enteros);
        pintarNumeros(enteros);

        bubbleSort(enteros);
        pintarNumeros(enteros);

    }

    public static void bubbleSort(int[] array) {
        boolean hasChanged;

        do {
            hasChanged = false;

            for(int i = 0; i < array.length - 1; i++) {
                boolean revert = array[i] > array[i + 1];

                if(!revert) continue;

                hasChanged = true;
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        } while(hasChanged);
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
}
