public class Main {

    public static void main (String[] args) {

        Circulo cir1 = new Circulo(5);

        System.out.println("Area del circulo de radio " + cir1.getRadio() + " es " + cir1.getArea());

        Cilindro cil1 = new Cilindro(5, 5);

        System.out.println("Volumen del cilindro de radio " + cil1.getRadio() +
                " y altura " + cil1.getAltura() + " es " + cil1.getVolumen());
    }
}
