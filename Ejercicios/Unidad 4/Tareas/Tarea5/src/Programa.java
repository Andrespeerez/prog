public class Programa {

    public static void main(String[] args) {

        System.out.println("Número de parámetros recibidos: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Parámetro: " + i + " -- " + args[i]);
        }
    }
}
