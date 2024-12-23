public class Main
{
    public static void main(String[] args)
    {
        // Crear un círculo
        Figura circulo = new Circulo(7.5d);
        System.out.println("\nCírculo 7.5cm");
        System.out.println("Área círculo: " + circulo.calcularArea());
        System.out.println("Perímetro círculo: " + circulo.calcularPerimetro());

        // Crear un rectangulo
        Figura cuadrado = new Rectangulo(5);
        System.out.println("\nCuadrado 5cm");
        System.out.println("Área cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro cuadrado: " + cuadrado.calcularPerimetro());

        // Crear un rectangulo
        Figura rectangulo = new Rectangulo(8, 4);
        System.out.println("\nRectángulo 8 x 4cm");
        System.out.println("Área rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro rectángulo: " + rectangulo.calcularPerimetro());

        // Crear un triangulo
        Figura triangulo = new Triangulo(18, 15);
        System.out.println("\nTriángulo b = 18cm, h = 15cm");
        System.out.println("Área triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro triángulo: " + triangulo.calcularPerimetro());

    }
}
