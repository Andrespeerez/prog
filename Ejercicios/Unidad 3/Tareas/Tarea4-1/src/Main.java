public class Main {

    public static void main(String[] args) {

        System.out.println(getCharOnString("hola", 3));

        System.out.println(getCharUnicode("hola", 3));

        compateStringToString("a", "c");
        compateStringToString("c", "a");
        compateStringToString("Texto 1", "Texto 1");

        compateStringToString("texto 1", "Texto 1");
        compateStringToStringIgnoreCase("texto 1", "Texto 1");

        System.out.println(stringContainsString("HoLA MunDo", "mundo"));

        System.out.println(stringStartsWith("hola", "h"));

        System.out.println(replaceCharForChar("hola caracola", 'a', 'c'));

        System.out.println(removeCharAt("hola", 2));
        System.out.println(removeCharAt2("hola", 2));

        System.out.println(revertString("hola mundo"));

        System.out.println(textBetweenIndexs("Hoy estamos a 13 grados", 0, 2));

        System.out.println(noRepeatChars("programacion"));

        System.out.println(onlyNonRepeatedChars("abbacec"));

        divideText("abcdefghijklmnopqrst", 5);

        imprimeIndices("Hola");

        System.out.println(revertirTexto("testeando"));

        System.out.println(noCharsRepeated("En un lugar de la mancha de cuyo nombre no quiero acordarme"));

        divideString("abcdefghijklmnopqrst", 5);
    }


    /*
     * Escribe un metodo Java para obtener un caracter en el indice dado como parámetro
     * dentro de un String pasado como parametro
     */
    public static char getCharOnString(String text, int index) {

        return text.charAt(index);
    }

    /*
     * Escribe un metodo Java para obtener el caracter Unicode point en una posición antes del
     * indice dado dentro de un String dado
     */
    public static int getCharUnicode(String text, int index) {
        return text.codePointAt(index - 1);
    }

    /*
     * Escribe un metodo Java para obtener el caracter Unicode point en una posición antes del
     * indice dado dentro de un String dado. QUE IGNORE MAYUSCULAS Y MINUSCULAS
     */
    public static int getCharUnicodeIgnoreCase(String text, int index) {
        return text.toLowerCase().codePointAt(index - 1);
    }

    /*
     * Escribe un metodo Java para comparar dos string lexicograficamente. Dos strings son
     * lexicograficamente ifuales si tienen la misma longitud y contienen los mismos caracteres
     * en las mismas posiciones. Si un String es mayor que otro, por ejemplo "a" es menor que "b".
     */
    public static void compateStringToString(String a, String b) {
        int result = a.compareTo(b);
        if (result > 0) System.out.println("El string " + a + " es mayor que " + b);
        if (result < 0) System.out.println("El string " + a + " es menor que " + b);
        if (result == 0) System.out.println("El string " + a + " es igual que " + b);
    }

    /*
     * Modifica el metodo anterior para que ignore mayusculas de minusculas
     */
    public static void compateStringToStringIgnoreCase(String a, String b) {
        int result = a.toLowerCase().compareTo(b.toLowerCase());
        if (result > 0) System.out.println("El string " + a + " es mayor que " + b);
        if (result < 0) System.out.println("El string " + a + " es menor que " + b);
        if (result == 0) System.out.println("El string " + a + " es igual que " + b);
    }

    /*
     * Escribe un metodo que reciba un texto String y un patron de tipo String como parametros
     * y comprueba si el patron se encuentra dentor del texto ignorando mayusculas y minusculas
     */
    public static boolean stringContainsString(String text1, String text2) {
        return text1.toLowerCase().contains(text2.toLowerCase());
    }

    /*
     * Crea un metodo que compruebe si dos Strings pasadas por parámetro empiezan con el mismo
     * texto
     */
    public static boolean stringStartsWith(String text1, String text2) {
        return text1.startsWith(text2);
    }

    /*
     * Esribe un metodo que dado un String y dos caracteres pasados por parametro, reemplace dentro
     * del String un caracter por el otro
     */
    public static String replaceCharForChar(String text1, char char1, char char2) {
        return text1.replace(char1, char2);
    }


    public static void imprimeIndices(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.println("Caracter: " + texto.charAt(i) + " Indice: " + i);
        }
    }


    /*
     * Crea un metodo donde a partir de un String y una posición dadas, cree un nuevo String eliminando
     * el caracter de esa posición
     */
    public static String removeCharAt(String text, int index) {
        return text.substring(0, index) + text.substring(index + 1);
    }

    /*
     * Crea un metodo que devuelva un String dado revertido
     */
    public static String revertString(String text) {
        String resultado = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            resultado = resultado + text.charAt(i);
        }

        return resultado;
    }

    /*
     * Escribe un metodo que devuelva a partir de un String pasado como parametro y dos posiciones
     * especificas, el subtecto que se encuentra dentro del String en esas dos posiciones.
     */
    public static String textBetweenIndexs(String text, int index1, int index2) {
        return text.substring(index1, index2 + 1);
    }

    /*
     * Escribe un metodo que devuelva, a partir de un string pasado, el mismo String pero sin caracteres
     * duplicados.
     */
    public static String noRepeatChars(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == character) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                result += character;
            }
        }

        return result;
    }

    public static String onlyNonRepeatedChars(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == character && (i != j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                result += character;
            }
        }

        return result;
    }

    /*
     * Escribe un metodo que dado un String y un entero, imprima el String dividido en tantas partes
     * iguales como el entero, si el texto no es divisible entre ese número de partes iguales mostrará
     * el mensaje "El texto no es divisible entre" + entero
     */
    public static void divideText(String text, int div) {
        if (text.length() % div != 0) {
            System.out.println("El texto no es divisible entre " + div);
            return;
        }

        for (int i = 0; i < text.length() / div; i++) {
            System.out.println(text.substring((i) * div, (i + 1) * div));
        }
    }

    public static String revertirTexto (String texto) {
        String textoRevertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoRevertido += texto.charAt(i);
        }

        return textoRevertido;
    }

    public static String removeCharAt2(String texto, int index) {
        String result = "";
        for (int i = 0; i < texto.length(); i++) {
            if (i != index) result += texto.charAt(i);
        }

        return result;
    }

    public static String noCharsRepeated(String texto) {
        String result = "";

        for (int i = 0; i < texto.length(); i++) {
            char character = texto.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < i; j++) {
                if(texto.charAt(j) == character) {
                    isRepeated = true;
                    break;
                }
            }

            if(!isRepeated) result += texto.charAt(i);
        }

        return result;
    }

    public static void divideString(String texto, int div) {
        if (texto.length() % div != 0) {
            System.out.println("El texto no es divisible entre " + div);
            return;
        }

        int numeroDivisiones = texto.length() / div;

        for (int i = 0; i < numeroDivisiones; i++) {
            String division = texto.substring(i * div, (i + 1) * div);
            System.out.println(division);
        }
    }

}
