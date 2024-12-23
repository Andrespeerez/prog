import java.util.Scanner;

public class Debug {

    public static void main( String [] args ) {
        int start = 0;
        int num;
        int ultimoEspacio = -1;
        int sum = 0;
        String partTextoLeft;
        Scanner in = new Scanner(System.in);

        System.out.print("Inserta una serie de números enteros separados por espacios >> ");
        String texto = in.nextLine();
        int longitud = texto.length();


        try {
            for (int i = start; i < longitud; ++i) {
                if (texto.charAt(i) == ' ') {
                    partTextoLeft = texto.substring(ultimoEspacio + 1, i);
                    num = Integer.parseInt(partTextoLeft);
                    System.out.println("                " + num);
                    sum = sum + num;
                    ultimoEspacio = i;
                }
            }

            String ultimoNumero = texto.substring(ultimoEspacio + 1, longitud);
            num = Integer.parseInt(ultimoNumero);
            System.out.println("                " + num);
            sum = sum + num;
            System.out.println("         -------------------" + "\nThe sum of the integers is " + sum);
        } catch(NumberFormatException e)
        {
            System.out.println("ERROR: " + e.getMessage() + " - Expecting Number instead!");
        }
    }
}

//String[] palabras = texto.split(" ");
//
//int suma = 0;
//        for (String palabra : palabras)
//        {
//int numero;
//            System.out.println(palabra);
//numero = Integer.parseInt(palabra);
//suma += numero;
//        }
//
//                System.out.println(suma);
