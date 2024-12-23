public class Main {

    public static void main(String[] args) {
        cuentaAtras(3);
        System.out.println(contarCaracter("java", 'a'));
        System.out.println(sumCharacters("abc"));
        System.out.println(eliminarAdyacentes("aaabcccb"));
        System.out.println(esPalindromo("reconocer"));
        System.out.println(estaEquilibrado("[]"));
        System.out.println(estaEquilibrado("[)"));
        System.out.println(estaEquilibrado("[({}[]())]"));
        permutacionPalabra("abcd");

        funcion(1);
    }

    public static void cuentaAtras(int num) {
        if (num <= 0) {
            System.out.println();
            return;
        }
        else {
            System.out.print(num + " ");
            cuentaAtras(num - 1);
        }
    }

    public static int contarCaracter(String str, char ch) {
        int resultado = 0;

        if(str.length() == 1) {
            if(str.charAt(0) == ch) resultado = 1;

            return resultado;
        }
        else {
            if(str.charAt(0) == ch) resultado = 1;

            return resultado + contarCaracter(str.substring(1), ch);
        }
    }

    public static int sumCharacters (String text) {
        if (text.length() == 1) {
            return text.charAt(0);
        } else {
            return text.charAt(0) + sumCharacters(text.substring(1));
        }
    }

    public static String eliminarAdyacentes(String str) {
        if(str.length() == 1) return str.charAt(0) + "";

        boolean isEqual = (str.charAt(0) == str.charAt(1));
        if(isEqual) return eliminarAdyacentes(str.substring(1));
        else return str.charAt(0) + eliminarAdyacentes(str.substring(1));
    }

    public static boolean esPalindromo(String str) {

        if(str.length() <= 1) return true; // Caso Base 1
        if(! ( str.charAt(0) == str.charAt(str.length() - 1))) return false; // Caso Base 2

        return esPalindromo(str.substring(1, str.length() - 1)); // Recursividad
    }

    public static boolean estaEquilibrado(String text) {
        if(text.isEmpty()) return true; // caso base

        String simplificado = text.replace("()", "").replace("[]", "").replace("{}", "");
        if(simplificado.equals(text)) return false; // Caso base si no hay reduccion

        return estaEquilibrado(simplificado);
    }

    // CHATGPT al rescate!
    public static void permutacionPalabra(String palabra) {
        permutacionPalabra("", palabra);
    }

    private static void permutacionPalabra(String prefijo, String resto) {
        // Caso base: Si el resto está vacío, imprimimos el prefijo (una permutación completa)
        if (resto.isEmpty()) {
            System.out.println(prefijo);
            return;
        }

        // Caso recursivo: recorrer cada carácter en el resto
        for (int i = 0; i < resto.length(); i++) {
            char currentChar = resto.charAt(i); // Caracter actual
            String nuevoResto = resto.substring(0, i) + resto.substring(i + 1); // Excluir el caracter actual
            permutacionPalabra(prefijo + currentChar, nuevoResto); // Llamada recursiva con el prefijo actualizado
        }
    }

    public static int funcion(int i) {
        int resultado = 0;
        for ( ; ; ) {
            if (i > 10) return resultado++;

            System.out.println("Numero : " + i);

            i++;
        }
    }


}
