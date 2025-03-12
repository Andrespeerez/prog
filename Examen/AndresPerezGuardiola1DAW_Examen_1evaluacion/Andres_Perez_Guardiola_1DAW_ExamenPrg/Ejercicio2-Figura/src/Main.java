
/*
Examen programacion: Ejercicio 2

Autor: Andrés Pérez Guardiola
Asignatura: 1º DAW Semi
 */
public class Main {
    public static void main(String[] args) {

        // Metodos de Clase
        System.out.println("Metodo Clase: Area circulo : " + Figura.calcularArea(5.0));
        System.out.println("Metodo Clase: Area circulo MAL : " + Figura.calcularArea(-5.0));

        System.out.println("Metodo Clase: Area rectangulo : " + Figura.calcularArea(5.0, 5.0, false));
        System.out.println("Metodo Clase: Area rectangulo MAL : " + Figura.calcularArea(-5.0, 5.0, true));

        System.out.println("Metodo Clase: Area triangulo : " + Figura.calcularArea(true, 5.0, 5.0));
        System.out.println("Metodo Clase: Area triangulo MAL : " + Figura.calcularArea(true, -5.0, 5.0));
        System.out.println();

        // Mediante Metodos Clase
        Figura circulo = new Figura(5.0);
        Figura circuloMal = new Figura(-3.0);

        Figura rectangulo = new Figura(5.0, 6.0); // o triangulo
        Figura rectanguloMal = new Figura(-5.0, 6.0); // o triangulo

        // Da igual los parametros que le pasemos
        // el metodo toma los parametros del objeto
        System.out.println("Metodo Instancia: Area Circulo : " + circulo.calcularArea(true));
        System.out.println("Metodo Instancia: Area Circulo MAL : " + circuloMal.calcularArea(true));

        System.out.println("Metodo Instancia: Area Rectangulo : " + rectangulo.calcularArea(4, 2));
        System.out.println("Metodo Instancia: Area Rectangulo MAL : " + rectanguloMal.calcularArea(4, 2));

        System.out.println("Metodo Instancia: Area Triangulo : " + rectangulo.calcularArea(4, true, 2));
        System.out.println("Metodo Instancia: Area Triangulo MAL : " + rectanguloMal.calcularArea(4, true, 2));






    }
}