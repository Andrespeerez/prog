public class MainPolimorfismo {

    public static void main(String[] args) {

        Coche c1 = new Electrico("Tesla", 0);
        c1.arrancar();
        System.out.println();

        Coche c2 = new Deportivo("Ferrari", 12);
        c2.arrancar();
        System.out.println();

        Coche c3 = new CocheViejo("Seat 500", 4);
        c3.arrancar();
    }
}
