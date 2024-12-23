public class Alumno {
    public static void main(String[] args) {
        int var = 7;
        Simple simple = new Simple();
        System.out.println("Primer valor de la variable local: " + var);
        simple.devolver(var);
        System.out.println("Siguiente valor de la variable local: " + var);
    }
}
