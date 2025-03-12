
/*
Examen programacion: Ejercicio 1

Autor: Andrés Pérez Guardiola
Asignatura: 1º DAW Semi
*/
public class Main {
    public static void main(String[] args) {

        //a
        String myString = "Hola mundo";
        System.out.println("Cadena: " + myString);

        //b
        System.out.println("Longitud Cadena: " + myString.length());

        //c
        System.out.println("En Mayusculas: " + myString.toUpperCase());
        System.out.println("En Minusculas: " + myString.toLowerCase());

        //d
        String myString2 = ", esto es el examen de programacion";
        System.out.println(myString + myString2); // ó
        System.out.println(myString.concat(myString2));
        // ambas dan como resultado lo mismo

        //e
        String mySubString = myString.substring(5); // mundo
        System.out.println("SubString: " + mySubString);

        //f
        String examen = "examen";
        System.out.println("Index of examen: " + myString2.indexOf(examen)); //13, índice donde empieza subcadena

        //g
        //replace el examen por la practica
        String myStringReplace = myString2.replaceAll("el examen", "la practica");
        System.out.println("replaceAll: " + myString + myStringReplace);

        //h
        String cadena = "Hola Mundo";
        System.out.println("Equals? " + myString.equals(cadena));
        System.out.println("Equals? (ignore case) " + myString.equalsIgnoreCase(cadena));

        //i
        System.out.println("Starts with Mundo? " + myString.startsWith("Mundo"));
        System.out.println("Starts with Hola? " + myString.startsWith("Hola"));
        System.out.println("Ends with mundo? " + myString.endsWith("mundo"));

        //j
        System.out.println("Char at 5? " + myString.charAt(5));



    }
}