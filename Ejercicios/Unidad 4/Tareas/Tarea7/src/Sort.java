public class Sort {

    public static void main(String[] args) {

        int[] myInts = {24, 18, 90, 1, 0, 85, 34, 18};

        // counting Sort
        int[] ordenado = countingSort(myInts);


    }

    /**
     * BUBBLE SORT
     * Realiza permutaciones de valores hasta alcanzar la ordenación
     *
     * @param array de enteros
     * @return int[] con valores ordenados
     */
    public static int[] bubbleSort(int[] array) {
        int[] ordered = array.clone();

        boolean isOrdenado;
        do {
            isOrdenado = true; // asumimos ordenado mientras se demuestre lo contrario

            for (int i = 0; i < array.length - 1; i++) {
                if( ordered[i] > ordered[i + 1]) {
                    isOrdenado = false; // Confirmamos que no está ordenado

                    int temp = ordered[i];
                    ordered[i] = ordered[i + 1];
                    ordered[i + 1] = temp;

                }
            }

            // Pintamos antes de repetir el bucle
            print(ordered);

        } while (! isOrdenado);

        return ordered;
    }

    public static int[] countingSort (int[] array) {
        int[] ordenado = new int[array.length];

        // find min and max
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++ ) {
            if(min > array[i]) min = array[i];
            if(max < array[i]) max = array[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        int[] recuento = new int[max-min + 1];
        print(recuento);

        // count ocurrences
        for (int i = 0; i < array.length; i++) {
            recuento[array[i] - min] += 1;
        }

        print(recuento);

        // acumulative sum
        int sumatorio = 0;
        for (int i = 0; i < recuento.length; i++) {
            if(recuento[i] == 0) recuento[i] = sumatorio;
            else {
                int cantidad = recuento[i];
                recuento[i] = sumatorio + cantidad;
                sumatorio += cantidad;
            }
        }

        print(recuento);

        // order the array
        for (int i = 0; i < array.length; i++) {
            // Manejas numeros repetidos
            // Cuentas representa las veces que se repite
            int cuentas = 1;
            // CALCULO CUENTAS
            // No puede hacerse con el primer valor del array (IndexOutOfBoundsException)
            if (array[i] - min != 0) {

                // Debe ser mayor el valor actual que el anterior para sacar cuentas
                int numeroActual = recuento[array[i] - min];
                int numeroAnterior = recuento[array[i] - min - 1];
                boolean esMayor = numeroAnterior < numeroActual;
                if( esMayor ) {
                    cuentas = recuento[array[i] - min] - recuento[array[i] - min - 1];
                }
            }

            // Coloca la sucesion de repeticiones en su correspondiente posicion
            // TENIENDO EN CUENTA LAS CUENTAS
            for (int j = 1; j <= cuentas; j++) {
                // Posicion en el array ordenado de los distintos numeros
                // j puede valer desde 1 hasta cuentas
                int posicion = recuento[array[i] - min] - j;

                ordenado[posicion] = array[i];
            }

        }

        print(ordenado);

        return ordenado;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}
