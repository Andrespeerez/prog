public class Main {

    public static void main(String[] args) {
        mystery(100);
    }

    public static void mystery(int n) {
        System.out.println(n + " ");
        if(n <= 5) {
            mystery (n + 1);
        }
    }
}
