import org.w3c.dom.css.Rect;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Rectangulo rect = new Rectangulo(2, 3);
        Triangulo tria = new Triangulo(2, 3);

        System.out.println("Area rect: " + rect.getArea());
        System.out.println("Area tria: " + tria.getArea());
        System.out.println("Perimeter rect: " + rect.getPerimeter());
        System.out.println("Perimeter tria: " + tria.getPerimeter());

        System.out.println("\nRedimensionar rectangulo");
        rect.redimensionar(2);
        System.out.println("Area rect: " + rect.getArea());
        System.out.println("Perimeter rect: " + rect.getPerimeter());


        Rectangulo[] rectangulos = new Rectangulo[10];

        rectangulos[0] = new Rectangulo(2, 3);
        rectangulos[1] = new Rectangulo(2, 10);
        rectangulos[2] = new Rectangulo(5, 5);
        rectangulos[3] = new Rectangulo(4, 2);
        rectangulos[4] = new Rectangulo(6, 2);
        rectangulos[5] = new Rectangulo(1, 1);
        rectangulos[6] = new Rectangulo(4, 5);
        rectangulos[7] = new Rectangulo(8, 10);
        rectangulos[8] = new Rectangulo(7, 7);
        rectangulos[9] = new Rectangulo(4, 4);

        Arrays.sort(rectangulos);

        System.out.println();
        for (Rectangulo r : rectangulos) {
            System.out.println(r);
        }

    }
}
