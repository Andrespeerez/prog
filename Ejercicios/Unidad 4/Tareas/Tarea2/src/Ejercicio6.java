public class Ejercicio6 {

    public static void main(String[] args) {

        int[] miArray = {-35, -13, -77, -46, -82, -2, -26};

        System.out.println("Maximo: " + maximo(miArray));
        System.out.println("Minimo: " + minimo(miArray));

    }

    public static int maximo(int[] array) {
        int max = array[0];

        for( int element : array) {
            if (element > max) max = element;
        }

        return max;
    }

    public static int minimo(int[] array) {
        int min = array[0];

        for( int element : array) {
            if (element < min) min = element;
        }

        return min;
    }
}
