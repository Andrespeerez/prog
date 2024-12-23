public class Estatica {

    static int x = 6;

    Estatica() {
        x++;
    }

    void metodo() {
        System.out.print("-x" + x);
    }

    public static void main (String[] args) {
        Estatica e1, e2, e3, e4;
        Estatica e5 = new Estatica();
        Estatica e6 = new Estatica();
        Estatica e7 = new Estatica();
        e7.metodo();
    }
}
