public class Main {
    public static void main(String[] args) {
        System.out.println(exponente(5,3));
    }

    public static int exponente(int x, int e) {
        int resultado = 1;
        for( ; e > 0; e--) {
            resultado *= x;
        }

        return resultado;
    }

}
