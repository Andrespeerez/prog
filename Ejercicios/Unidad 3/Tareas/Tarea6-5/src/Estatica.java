public class Estatica {

    static int x;
    int y;

    Estatica() {
        x += 2;
        y++;
    }

    static int obtenerCuadrado() {
        return x * x;
    }

    public static void main(String[] args) {
        Estatica e1 = new Estatica();
        Estatica e2 = new Estatica();
        int cuadrado = e1.obtenerCuadrado();
        System.out.print("x " + cuadrado + "- y" + e2.y);
    }
}
