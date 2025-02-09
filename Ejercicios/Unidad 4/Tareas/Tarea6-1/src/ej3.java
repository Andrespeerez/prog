public class ej3 {

    public static void main(String[] args) {

        int[][] matriz = { {1, 9, 4},
                            {0, 2},
                            {0, 1, 2, 3, 4}};

        int[] fila0 = {3, 4, 5, 6, 7};
        matriz[0] = fila0;

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }
}
