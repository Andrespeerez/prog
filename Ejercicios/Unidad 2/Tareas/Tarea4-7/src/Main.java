import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {

        Coche coche = new Coche("Seat Panda");

        System.out.println(coche.getModelo());
        coche.setModelo("Seat Leon");
        System.out.println(coche.getModelo());

        System.out.print("Introduce un número:  ");
        int contador = sc.nextInt();

        do {
            System.out.println(contador);
            contador = contador - 1;
            if(contador == 5) throw new RuntimeException("ERROR");
        } while (contador > 0);
    }
}
