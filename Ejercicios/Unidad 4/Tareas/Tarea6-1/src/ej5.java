public class ej5 {

    public static void main(String[] args) {

        int[][] int2d = new int[5][10];

        for (int i = 0; i < int2d.length; i++) {
            if (int2d[i] == null) {
                System.out.println("Fila vacía");
                continue;
            }

            for (int j = 0; j < int2d[i].length; j++) {
                System.out.print(int2d[i][j] + "  ");
            }

            System.out.println();
        }

        System.out.println();

        System.out.println("Último elemento fila 3 (índice 2) " + int2d[2][9]);

        int2d[2][9] = 100;

        System.out.println("Último elemento fila 3 (índice 2) " + int2d[2][9]);

    }
}
