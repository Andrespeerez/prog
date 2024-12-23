public class Main
{
    public static void main(String[] args)
    {
        // a
        String cadenaDeTexto = "Esto es una cadena de texto";

        // b
        int longitud = cadenaDeTexto.length();
        System.out.println("La cadena mide " + longitud);

        // c
        String enMayusculas = cadenaDeTexto.toUpperCase();
        String enMinusculas = cadenaDeTexto.toLowerCase();
        System.out.println("MAYUSCULAS : " + enMayusculas);
        System.out.println("MINUSCULAS : " + enMinusculas);

        // d
        String cadena2 = " muy larga ...";
        System.out.println(cadenaDeTexto.concat(cadena2));

        // e
        String subCadena = cadenaDeTexto.substring(12, 27);
        System.out.println(subCadena);

        // f
        int posicionCadena = cadenaDeTexto.indexOf("cadena");
        System.out.println("La posición de la palabra Cadena es " + posicionCadena);

        // g
        String cadenaCambiada = cadenaDeTexto.replace("a cadena de texto", " String");
        System.out.println(cadenaCambiada);

        // h
        String[] cadenaSpliteada = cadenaDeTexto.split(" ");
        int longitudLista = cadenaSpliteada.length;
        for (int i = 0; i < longitudLista; i++) {
            System.out.println(cadenaSpliteada[i]);
        }

        // i
        String cadenaNum1 = "Hola";
        String cadenaNum2 = "HOLA";
        System.out.println(cadenaNum1.equals(cadenaNum2));
        System.out.println(cadenaNum1.equalsIgnoreCase(cadenaNum2));

        // j
        System.out.println(cadenaDeTexto.compareTo(cadenaDeTexto));
        System.out.println(cadenaDeTexto.compareTo(subCadena));
        System.out.println(subCadena.compareTo(cadenaDeTexto));
        /*
         * Este método devuelve 0 si los dos strings son iguales
         * Devuelve un número negativo si ... En verdad no entiendo lo que dice la documentación
         *
         */

        // k
        /*
        Quita todos los espacios y tabulaciones al inicio de un String
         */
        String textoNuevo = "   \t\t   texto Aqui";
        System.out.println(textoNuevo.trim());

        // l
        String textoDePrueba = "Hola Mundo!";
        System.out.println(textoDePrueba.startsWith("Hol"));
        System.out.println(textoDePrueba.endsWith("Mud"));

        //m
        System.out.println(cadenaDeTexto.charAt(12));

        // n
        // Convierte un número en string
        // (es lo que hace el método println implícitamente cuando le doy un int)
        System.out.println(String.valueOf(23));


    }
}
