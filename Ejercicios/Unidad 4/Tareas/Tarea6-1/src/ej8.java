public class ej8 {

    public static void main(String[] args) {

        int[][] ventasDiarias = new int[52][7];

        // Cantidades venta periódico semanal
        int[] cantidades = new int[52];
        for(int i = 0; i < ventasDiarias.length; i++ ) {
            int suma = 0;

            for (int j = 0; j < ventasDiarias[i].length; j++) {
                suma += ventasDiarias[i][j];
            }

            cantidades[i] = suma;
        }

        // Promedio entre periódicos
        int promedio = 0;
        for (int i = 0; i < cantidades.length; i++) {
            promedio += cantidades[i];
        }

        promedio = promedio / cantidades.length;

        System.out.println("Promedio de ventas Semanal: " + promedio);
    }
}
