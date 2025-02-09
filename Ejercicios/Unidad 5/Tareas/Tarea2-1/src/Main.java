public class Main {

    public static void main(String[] args) {

        Pared p1 = new Pared("norte");
        Pared p2 = new Pared("este");
        Pared p3 = new Pared("sur");
        Pared p4 = new Pared("oeste");

        Techo t = new Techo(10,1);

        Cama c = new Cama("Rustico", 2, 1, 2, 3);

        Lampara l = new Lampara("Vieja", true, 5);

        Habitacion habt = new Habitacion("Habitacion", p1, p2, p3, p4, t, c, l);

        habt.hacerLaCama();
        System.out.println(habt.getLamapara());


    }
}
