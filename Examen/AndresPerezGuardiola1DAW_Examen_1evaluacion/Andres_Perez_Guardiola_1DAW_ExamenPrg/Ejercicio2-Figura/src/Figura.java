
/*
Examen programacion: Ejercicio 2

Autor: Andrés Pérez Guardiola
Asignatura: 1º DAW Semi
*/
public class Figura {

    private double radio;
    private double base;
    private double altura;

    // Constructor Circulo
    public Figura(double radio) {
        this.radio = radio;
    }

    // Constructor Rectangulo o Triangulo
    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Metodos de clase
    public static double calcularArea(double radio) {
        double area = -1;

        if (radio < 0) return area;

        area = radio * radio * Math.PI;

        return area;
    }

    public static double calcularArea(double x, double y, boolean isRectangle) {
        double area = -1;

        if(x < 0 || y < 0) return area;

        area = x * y;

        return area;
    }

    public static double calcularArea(boolean isTriangle, double base, double altura) {
        double area = -1;

        if(base < 0 || altura < 0) return area;

        area = base * altura / 2;

        return area;
    }

    // Metodos de instancia
    public double calcularArea(boolean isCircle) {
        double area = -1;

        if (this.radio < 0) return area;

        area = this.radio * this.radio * Math.PI;

        return area;
    }

    public double calcularArea(double x, double y) {
        double area = -1;

        if(this.base < 0 || this.altura < 0) return area;

        area = this.base * this.altura;

        return area;
    }

    public double calcularArea(double base, boolean isTriange, double altura) {
        double area = -1;

        if(this.base < 0 || this.altura < 0) return area;

        area = this.base * this.altura / 2;

        return area;
    }
}
