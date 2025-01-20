public class Ejercicio1 {

    public static void main(String[] args) {

        int[] miArray = {8,3,4,5,3,1};

        revertir(miArray);

    }

    public static void revertir(int[] array) {
        System.out.println("\nArray derecho: ");
        imprimirArray(array);

        int[] tempArray = new int[array.length];

        for(int i = 0; i < array.length; i++) {
            tempArray[i] = array[array.length - 1 - i];
        }

        System.out.println("\nArray revertido: ");
        imprimirArray(tempArray);
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion " + i + "  Valor: " + array[i]);
        }
    }
}
