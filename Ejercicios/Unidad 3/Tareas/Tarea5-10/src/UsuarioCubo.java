import java.util.Scanner;

public class UsuarioCubo
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame tres números enteros: ");
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();

        Cubo cubo1 = new Cubo(lado1);
        Cubo cubo2 = new Cubo(lado2);
        Cubo cubo3 = new Cubo(lado3);

        System.out.println("Area cubo1: " + cubo1.area());
        System.out.println("Area cubo2: " + cubo2.area());
        System.out.println("Area cubo3: " + cubo3.area());

        System.out.println("Volumen cubo1: " + cubo1.volumen());
        System.out.println("Volumen cubo2: " + cubo2.volumen());
        System.out.println("Volumen cubo3: " + cubo3.volumen());

    }
}
