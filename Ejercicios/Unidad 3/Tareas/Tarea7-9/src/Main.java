public class Main {
    public static void main(String[] args) {
        System.out.println(sumaDigitos(516432));
    }

    public static int sumaDigitos(int num) {
        //Descomponer numero en unidades, decenas, centenas, etc.
        if (num == 0) return 0;

        return num % 10 + sumaDigitos(num / 10);
    }
}
