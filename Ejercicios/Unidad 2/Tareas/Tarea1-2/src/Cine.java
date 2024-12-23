import java.util.Scanner;

public class Cine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int age = 0;
        System.out.print("Introduce tu edad:  ");
        age = sc.nextInt();

        if(age < 13) // 13 inclusive o solo menores de 13?
        {
            System.out.println("Se le aplicará la tarifa de niño.");
        }
        else
        {
            System.out.println("Se le aplicará la tarifa de adulto");
        }
        System.out.println("Disfruta la película.");
    }
}
