public class MainPintura {

    public static void main(String[] args) {

        Pintura pintura = new Pintura(250);

        Rectangulo r = new Rectangulo(20, 35);
        Esfera e = new Esfera(15);
        Cilindro c = new Cilindro(10,30);

        System.out.println("Para pintar " + r + " se necesita " + pintura.cantidadPintura(r));
        System.out.println("Para pintar " + e + " se necesita " + pintura.cantidadPintura(e));
        System.out.println("Para pintar " + c + " se necesita " + pintura.cantidadPintura(c));

    }
}
