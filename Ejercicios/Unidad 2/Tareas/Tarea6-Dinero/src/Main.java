import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de dinero a despomponer: ");
        int dinero = sc.nextInt();

        final int BILLETE100 = 100;
        int numBillete100 = dinero / BILLETE100;

        dinero = dinero % BILLETE100;
        System.out.println(numBillete100 + " billete de 100");

        final int BILLETE50 = 50;
        int numBillete50 = dinero / BILLETE50;

        dinero = dinero % BILLETE50;
        System.out.println(numBillete50 + " billete de 50");

        final int BILLETE20 = 20;
        int numBillete20 = dinero / BILLETE20;

        dinero = dinero % BILLETE20;
        System.out.println(numBillete20 + " billete de 20");

        final int BILLETE10 = 10;
        int numBillete10 = dinero / BILLETE10;

        dinero = dinero % BILLETE10;
        System.out.println(numBillete10 + " billete de 10");

        final int BILLETE5 = 5;
        int numBillete5 = dinero / BILLETE5;

        dinero = dinero % BILLETE5;
        System.out.println(numBillete5 + " billete de 5");

        final int MONEDA2 = 2;
        int numMoneda2 = dinero / MONEDA2;

        dinero = dinero % MONEDA2;
        System.out.println(numMoneda2 + " moneda de 2");

        final int MONEDA1 = 1;
        int numMoneda1 = dinero / MONEDA1;

        dinero = dinero % MONEDA1;
        System.out.println(numMoneda1 + " moneda de 1");


    }
}
