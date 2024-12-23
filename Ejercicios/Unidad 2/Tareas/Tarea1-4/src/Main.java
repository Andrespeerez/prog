import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final float LIMITE_IMPUESTOS = 300f;
        final float IMPUESTO = 0.05f;

        System.out.print("Introduce el precio del artículo: ");
        float precio = sc.nextFloat();

        if (precio < LIMITE_IMPUESTOS)
        {
            System.out.println("El artículo está libre de impuestos");
            System.out.println("El Coste total es " + precio + "€");
        } else if (precio >= LIMITE_IMPUESTOS) {
            System.out.println("El artículo tiene un impuesto de " + precio * IMPUESTO + "€");
            System.out.println("El Coste total es " + precio * (1 + IMPUESTO) + "€");
        }

    }
}
