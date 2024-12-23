import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero:  ");
        int numero = sc.nextInt();

        if (numero > 0) // Caso numero == 0 no contemplado
        {
            System.out.println("El número " + numero + " es positivo.");
            System.out.println("Todos los números positivos son mayores a cero.");
        }
        else if (numero < 0)
        {
            System.out.println("El número " + numero + " es negativo.");
        }


    }
}
