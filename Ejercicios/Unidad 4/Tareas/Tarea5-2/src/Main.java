public class Main {

    public static void main(String[] args) {

        AnalizadorFrecuencias analizador = new AnalizadorFrecuencias();
        analizador.contarLetras("An algorithm is a set of instructions for solving logical and mathematical" +
                "problems, or for accomplishing some other task. ");
        analizador.imprimirArray();
    }
}
