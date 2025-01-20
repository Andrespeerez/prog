public class ArrayOperations {

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(array.length - 1 > i) System.out.print(", ");
        }
        System.out.print("]\n");
    }

    public static void print(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(array.length - 1 > i) System.out.print(", ");
        }
        System.out.print("]\n");
    }

    public static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = reversedArray[i];
        }
    }

    public static int max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if(max < array[i]) max = array[i];
        }

        return max;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if(min > array[i]) min = array[i];
        }

        return min;
    }

    public static int sum(int[] array) {
        int sum = array[0];

        for (int i = 1; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
}
