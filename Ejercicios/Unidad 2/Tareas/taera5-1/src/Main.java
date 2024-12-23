import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        final int TARGET = 6;

        int suma = 0;
        int contador = 0;
        int contadorImpar = 0;
        int contadorTarget = 0;
        int maxValue = 0;
        while (true){
            System.out.print("Introduce un número (0 para salir):  ");
            int opcion = sc.nextInt();

            if(opcion == 0)
            {
                break;
            }

            if (opcion > maxValue)
            {
                maxValue = opcion;
            }

            if (opcion % 2 != 0)
            {
                contadorImpar++;
            }

            if (opcion == TARGET)
            {
                contadorTarget++;
            }

            contador = contador + 1;
            suma = suma + opcion;
        }

        System.out.println("\nCantidad de valores introducidos: " + contador);
        System.out.println("Cantidad de número impares: " + contadorImpar);
        System.out.println("El valor " + TARGET + " se insertó " + contadorTarget);
        System.out.println("La suma es : " + suma);
        System.out.println("El mayor valor es : " + maxValue);

    }
}
