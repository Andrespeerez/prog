import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce 3 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c)
        {
            System.out.println("A es el mayor");
        }
        else if ( b > a && b > c)
        {
            System.out.println("B es el mayor");
        }
        else
        {
            System.out.println("C es el mayor");
        }

    }
}
