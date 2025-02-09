package Ejercicio2;

public class Main {

    public static void main(String[] args) {
        int[] array = {-2, 45, -29, 77, 56, 31};

        System.out.println(
                ArrayOperations.max(array)
        );

        int[] copyArray = ArrayOperations.copy(array);

        int[] arrayOrdenado = ArrayOperations.copy(array);
        ArrayOperations.sort(arrayOrdenado);
        ArrayOperations.print(arrayOrdenado);

        System.out.println(
                ArrayOperations.equalsWithoutOrder(array, arrayOrdenado)
        );

        System.out.println(
                ArrayOperations.equals(array, copyArray)
        );

        ArrayOperations.removeOddNumbers(array);

        System.out.println(
                ArrayOperations.sum(array)
        );

        System.out.println(
                ArrayOperations.min(array)
        );

        ArrayOperations.printRange(array, 1, 4);

        arrayOrdenado = ArrayOperations.reverse(arrayOrdenado);

        ArrayOperations.printRange(arrayOrdenado, 2, 5);


        // Tests para el metodo isArrayOn

        // Caso 1: Array src está completamente dentro de dst (elementos coinciden)
        int[] src1 = {1, 2, 3};
        int[] dst1 = {3, 1, 4, 2, 5};
        // Respuesta esperada: true
        System.out.println(
                ArrayOperations.isArrayOn(src1, dst1)
        );

        // Caso 2: Array src no está dentro de dst (elementos no coinciden)
        int[] src2 = {1, 6};
        int[] dst2 = {3, 1, 4, 2, 5};
        // Respuesta esperada: false
        System.out.println(
                ArrayOperations.isArrayOn(src2, dst2)
        );

        // Caso 3: src tiene más elementos que dst
        int[] src3 = {1, 2, 3, 4};
        int[] dst3 = {1, 2, 3};
        // Respuesta esperada: false
        System.out.println(
                ArrayOperations.isArrayOn(src3, dst3));

        // Caso 4: src está vacío
        int[] src4 = {};
        int[] dst4 = {1, 2, 3};
        // Respuesta esperada: true
        System.out.println(
                ArrayOperations.isArrayOn(src4, dst4));

        // Caso 5: dst está vacío
        int[] src5 = {1, 2};
        int[] dst5 = {};
        // Respuesta esperada: false
        System.out.println(
                ArrayOperations.isArrayOn(src5, dst5));

        // Caso 6: src y dst son iguales
        int[] src6 = {1, 2, 3};
        int[] dst6 = {1, 2, 3};
        // Respuesta esperada: true
        System.out.println(
                ArrayOperations.isArrayOn(src6, dst6));

        // Caso 7: dst tiene elementos duplicados, pero src no está dentro
        int[] src7 = {2, 2, 3};
        int[] dst7 = {3, 1, 2, 2, 5};
        // Respuesta esperada: false
        System.out.println(
                ArrayOperations.isArrayOn(src7, dst7));

        // Caso 8: dst tiene elementos duplicados y src está dentro
        int[] src8 = {2, 3};
        int[] dst8 = {3, 1, 2, 2, 3};
        // Respuesta esperada: true
        System.out.println(
                ArrayOperations.isArrayOn(src8, dst8));

        // Caso 9: src y dst tienen los mismos elementos pero en distinto orden
        int[] src9 = {3, 2, 1};
        int[] dst9 = {1, 2, 3};
        // Respuesta esperada: true
        System.out.println(
                ArrayOperations.isArrayOn(src9, dst9));

        // 5.
        int[] example5 = {-6, 33, 98, 10, 9};
        int[] output5 = ArrayOperations.deleteOneDigitNumber(example5);
        ArrayOperations.print(output5);


    }
}
