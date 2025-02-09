public class ej10 {

    public static void main(String[] args) {

        int[][] ventasDiarias = new int[52][7];

        // Promedio entre periódicos
        int promedio = 0;
        for (int i = 0; i < ventasDiarias.length; i++) {
            promedio += ventasDiarias[i][6];
        }

        promedio = promedio / ventasDiarias.length;

        System.out.println("Promedio de ventas los Domingos: " + promedio);

        int[][][] matriz3d2 = {{{0, 2}, {0, 4}, {5, 3}}, {{0, 4}, {9, 7}, {4, 2}}};
    }
}
