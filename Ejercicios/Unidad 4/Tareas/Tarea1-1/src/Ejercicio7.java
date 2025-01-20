public class Ejercicio7 {

    public static void main(String[] args) {
        double[] array = new double[4];

        array[0] = 5.1;
        array[1] = 10.0;
        array[2] = 51.5;

        int j = 3;
        array[j] = array[j - 1] + array[j - 2];

        System.out.println("array[" + j + "] == " + array[j]);

        char[] profesora = {'p', 'a', 't', 'r', 'i', 'c', 'i', 'a'};

        char[] profesora2 = new char[8];

        profesora2[0] = 'p';
        profesora2[1] = 'a';
        profesora2[2] = 't';
        profesora2[3] = 'r';
        profesora2[4] = 'i';
        profesora2[5] = 'c';
        profesora2[6] = 'i';
        profesora2[7] = 'a';

        invertir(profesora2);


        int[] dataA = {12, 23, 45, 56};

        double[] dataB = new double[6];

        dataB[0] = dataA[2];
        dataB[3] = dataA[2];
        dataB[1] = dataA[1];
        dataB[5] = dataA[0];

        System.out.println( "dataB:" + dataB[0] + ", " + dataB[1] + ", " + dataB[2] + ", " + dataB[3] + ", " + dataB[4]
                + ", " + dataB[5] );

        char[] array1 = {'A', 'n', 'd', 'r', 'e', 's'};
        char[] array2 = new char[6];

        array2[0] = array1[5];
        array2[1] = array1[4];
        array2[2] = array1[3];
        array2[3] = array1[2];
        array2[4] = array1[1];
        array2[5] = array1[0];

    }

    private static void invertir(char[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
