public class Tarea7 {

    public static void main(String[] args) {

        String[] cadenas = new String[5];

        cadenas[0] = "Pera";
        cadenas[1] = "Manzana";
        cadenas[4] = "Naranja";

        for (int i = 0; i < cadenas.length; i++) {
            if( cadenas[i] == null) {
                System.out.println("Celda " + i + " vacía");
                continue;
            }

            System.out.println("Celda " + i + " Texto: " + cadenas[i]);
        }
     }
}
