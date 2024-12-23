import java.util.Scanner;

public class Main
{
    public static void main( String [] args )
    {
        double cost, qty;
        Scanner in = new Scanner(System.in);
        System.out.print("Inserta una cantidad: ");
        qty = in.nextDouble();
        cost = 15000;
        System.out.println("Total: " + qty * cost + "€");
    }
}
