import java.util.Arrays;

public class Pelicula {

    public static void main(String[] args) {

        /*
        Array de Objetos:

        Array de referencias de objetos tipo Video
         */
        Video[] videoclub = new Video[5];

        videoclub[3] = new Video();

        System.out.println(Arrays.toString(videoclub));

        int[] intArray = {1, 2, 3};
        ArrayOperations.print(intArray);

        String[] stringArray = {"HOLA", "mundo"};
        ArrayOperations.print(stringArray);

        ArrayOperations.reverse(intArray);
        ArrayOperations.print(intArray);

        int[] intArray2 = {5, 1, 5, 10, 14, 0, 585, 0, 5};
        System.out.println(ArrayOperations.max(intArray2));
    }
}

