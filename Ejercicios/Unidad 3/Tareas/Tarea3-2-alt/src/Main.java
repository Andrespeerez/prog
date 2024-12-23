public class Main
{
    public static void main(String[] args) {
        Punto miPunto = new Punto(6, 5);
        Punto miPunto2 = new Punto(3, 1);
        System.out.println(miPunto.distancia());
        System.out.println(miPunto.distancia(3, 1));
        System.out.println(miPunto.distancia(miPunto2));
    }
}
