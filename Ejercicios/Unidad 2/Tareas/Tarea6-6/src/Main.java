import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Con que numero quieres que incremente? ");
        int incremento = sc.nextInt();

        for (int i = 0; i < 100; i = i + incremento) {
            System.out.print("\t" + i);
        }

    }
}
