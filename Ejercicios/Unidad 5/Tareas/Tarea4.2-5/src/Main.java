import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Proporciona una forma");
            System.out.println("1 - Circulo");
            System.out.println("2 - Cuadrado");
            System.out.println("3 - Triangulo Equilatero");
            System.out.print("Tu opción:  ");
            int opcion = sc.nextInt();
            sc.nextLine();

            System.out.print("De que tamaño? ");
            double dim = sc.nextDouble();
            sc.nextLine();

            ShapeOperable forma;
            switch (opcion) {
                case 1:
                    forma = new Circulo(dim);
                    break;
                case 2:
                    forma = new Cuadrado(dim);
                    break;
                case 3:
                    forma = new TrianguloEquilatero(dim);
                    break;
                default:
                    continue;
            }

            System.out.println("Area: " + forma.perimetro());
            System.out.println("Area: " + forma.area());
        }
    }
}
