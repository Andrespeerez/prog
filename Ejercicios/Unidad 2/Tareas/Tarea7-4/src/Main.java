import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta la altura: ");
        int altura = sc.nextInt();
        System.out.print("Inserta la anchura: ");
        int anchura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print('#');
            }
            System.out.println();
        }

    }
}
