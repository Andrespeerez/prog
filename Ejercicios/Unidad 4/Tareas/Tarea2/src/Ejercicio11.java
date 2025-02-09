public class Ejercicio11 {

    public static void main(String[] args) {

        int[] array = {1,1,6};

        int[] array2 = {1, 5, 6, 3};

        System.out.println(isArrayOn(array, array2));

    }

    public static boolean isArrayOn(int[] src, int[] dst) {

        nextInt:
        for (int value : src) {

            for(int i = 0; i < dst.length; i++) {

                if(dst[i] == value) {
                    continue nextInt;
                }

            }

            return false;

        }

        return true;
    }
}
