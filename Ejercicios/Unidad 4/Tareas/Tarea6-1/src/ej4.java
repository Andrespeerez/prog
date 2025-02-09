public class ej4 {

    public static void main(String[] args) {

        int[][] matriz = {null,
                {1, 1},
                {0, 3},
                {0, 1, 2, 3, 4},
                null};

        for (int i = 0; i < matriz.length; i++) {
            // Matriz element is Null
            // Skip step
            if (matriz[i] == null) {
                System.out.println("Fila vacía");
                continue; // Skip this Element
            }

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }

            System.out.println();
        }
    }
}
