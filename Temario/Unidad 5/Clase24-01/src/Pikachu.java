import java.util.Scanner;

public class Pikachu extends Pokemon {

    public Pikachu() {
        this(10, 15, 100, "Pika", "Electrico");
    }

    private Pikachu(int pDefensa, int pAtaque, int pVida, String nombre, String tipo) {
        super(pDefensa, pAtaque, pVida, nombre, tipo);
    }

    public static Pikachu crearPikachu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Defensa: ");
        int pDefensa = sc.nextInt();
        System.out.print("Ataque: ");
        int pAtaque = sc.nextInt();
        System.out.print("Vida: ");
        int pVida = sc.nextInt();

        return new Pikachu(pDefensa, pAtaque, pVida, "Pika", "Electrico");
    }

    @Override
    public void atack() {
        System.out.println("PIKACHU, ATACA!\n");
    }

    public static void main(String[] args) {

        Pokemon p1 = new Pokemon();
        Pikachu p2 = new Pikachu();
        //Pikachu p3 = crearPikachu();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println();

        p1.atack();
        p2.atack();
    }
}
