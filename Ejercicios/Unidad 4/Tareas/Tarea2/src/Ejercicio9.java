import java.util.Arrays;

public class Ejercicio9 {

    public static void main(String[] args) {

        int[] array1 = {2,3,4,5};
        int[] array2 = {2,3,4,5};
        int[] array3 = {3,4,2,3};
        int[] array4 = {2, 4};

        System.out.println(isEquals(array1, array2));
        System.out.println(isEquals(array1, array3));
        System.out.println(isEquals(array1, array4));

        System.out.println();

        int[] array5 = {2,3,4,5};
        int[] array6 = {2,5,4,3};

        System.out.println(isEquals2(array5, array6));



    }

    public static boolean isEquals(int[] array1, int[] array2) {
         if (array1.length != array2.length) return false;

         for (int i = 0; i < array1.length; i++) {
             if(array1[i] != array2[i]) return false;
         }

        return true;
    }

    public static boolean isEquals2(int[] array1, int[] array2){
        if (array1.length != array2.length) return false;

        int[] newArray1 = array1.clone();
        int[] newArray2 = array2.clone();

        Arrays.sort(newArray1);
        Arrays.sort(newArray2);

        for (int i = 0; i < newArray1.length; i++) {
            if(newArray1[i] != newArray2[i]) return false;
        }

        return true;
    }

}
