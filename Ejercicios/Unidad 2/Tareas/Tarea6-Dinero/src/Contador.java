import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de dinero a despomponer: ");
        int dinero = sc.nextInt();

        final int MONEDA1 = 1;
        final int MONEDA2 = 2;
        final int BILLETE5 = 5;
        final int BILLETE10 = 10;
        final int BILLETE20 = 20;
        final int BILLETE50 = 50;
        final int BILLETE100 = 100;

        int numMoneda1 = 0;
        int numMoneda2 = 0;
        int numBillete5 = 0;
        int numBillete10 = 0;
        int numBillete20 = 0;
        int numBillete50 = 0;
        int numBillete100 = 0;

        for (; dinero > BILLETE100; ) {
            dinero = dinero - BILLETE100;
            numBillete100++;
        }
        System.out.println(numBillete100 + " billete de 100");

        for (; dinero > BILLETE50; ) {
            dinero = dinero - BILLETE50;
            numBillete50++;
        }
        System.out.println(numBillete50 + " billete de 50");

        for (; dinero > BILLETE20; ) {
            dinero = dinero - BILLETE20;
            numBillete20++;
        }
        System.out.println(numBillete20 + " billete de 20");

        for (; dinero > BILLETE10;) {
            dinero = dinero - BILLETE10;
            numBillete10++;
        }
        System.out.println(numBillete10 + " billete de 10");

        for (; dinero > BILLETE5; ) {
            dinero = dinero - BILLETE5;
            numBillete5++;
        }
        System.out.println(numBillete5 + " billete de 5");

        for (; dinero > MONEDA2; ) {
            dinero = dinero - MONEDA2;
            numMoneda2++;
        }
        System.out.println(numMoneda2 + " moneda de 2");

        for (; dinero > MONEDA1; ) {
            dinero = dinero - MONEDA1;
            numMoneda1++;
        }
        System.out.println(numMoneda1 + " moneda de 1");

    }
}
