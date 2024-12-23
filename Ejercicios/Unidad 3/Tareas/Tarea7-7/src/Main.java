public class Main {

    public static void main(String[] args) {
        System.out.println(exponente(5,3));
    }

    public static int exponente (int x, int e) {
        if (e == 0) return 1;

        return x * exponente(x, e - 1);
    }
}
