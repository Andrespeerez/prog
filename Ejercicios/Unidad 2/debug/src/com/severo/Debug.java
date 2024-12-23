package com.severo;

import java.util.Scanner;

public class Debug {

    public static void main( String [] args ) {
        int start = 0;
        int num;
        int ultimoEspacio = -1;
        int sum = 0;
        String partTexto;
        Scanner in = new Scanner(System.in);

        System.out.print("Inserta una serie de números enteros separados por espacios >> ");
        String texto = in.nextLine();
        int longitud = texto.length();

        for(int i = 0; i <= longitud; ++i) {
            if(texto.charAt(i) == ' ') {
                partTexto = texto.substring(i, ultimoEspacio + 1);
                num = Integer.parseInt(partTexto);
                System.out.println("                " + num);
                sum = num;
                ultimoEspacio = i;
            }
        }

        partTexto = texto.substring(ultimoEspacio + 1, longitud);
        num = Integer.parseInt(partTexto);
        System.out.println("                " + num);
        sum = num;
        System.out.println("         -------------------" + "\nThe sum of the integers is " + sum);
    }
}
