import java.util.Scanner;

/*
Examen programacion: Ejercicio 3

Autor: Andrés Pérez Guardiola
Asignatura: 1º DAW Semi
 */
public class Main {
    public static void main(String[] args) {

        introducirImprimirSumarYCalcularMedia();

    }

    public static void introducirImprimirSumarYCalcularMedia () {
        Scanner sc = new Scanner(System.in);

        int total = 10;

        double suma = 0;
        double media = 0;

        for (int i = 1; i <= total; i++) {

            System.out.print("Introduce un numero: ");
            double numero = sc.nextDouble();

            if(numero == 0) {
                System.out.println("Total numeros introducidos: " + (i - 1));
                break;
            }

            suma += numero;
            media = suma / i;

        }

        System.out.println();
        System.out.println("La suma es : " + suma);
        System.out.println("La media es : " + media);

    }
}