public class Ejercicio2 {

    public static void main(String[] args) {
        // Ejercicio 2-3
        int[] miArray = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};

        System.out.println("Maximo: " + maximo(miArray));

        // Ejercicio 4
        int[] miOtroArray = {-35, -13,- 77, -46, -83, -2, -26};

        System.out.println("Maximo: " + maximo(miOtroArray));
        System.out.println("Minimo: " + minimo(miOtroArray));

    }

    // Ejercicio 2-3
    public static int maximo(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }

        return max;
    }

    // Ejercicio 4
    public static int minimo(int[] array) {
        int min = array[0];

        for(int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }

        return min;
    }
}
