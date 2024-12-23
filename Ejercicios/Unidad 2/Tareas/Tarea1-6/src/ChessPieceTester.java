import java.util.Scanner;
public class ChessPieceTester {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String piece;
        System.out.println("Introduce la inicial del nombre de la pieza de ajedrez: ");
        piece = sc.nextLine();
        if (piece.equals("K")){ //Rey
            System.out.println("Puede moverse en todas direcciones pero solo avanza una posición.");
        } else if (piece.equals("Q")) { //Dama o reina
            System.out.println("Puede moverse en todas direcciones tantas casillas como quiera.");
        } else if (piece.equals("k")) {
            System.out.println("Se mueve en un movimiento en L: dos casillas en una dirección, una en la otra.");
        } else {
            System.out.println("Es otro tipo de pieza.");
        }
    }
}