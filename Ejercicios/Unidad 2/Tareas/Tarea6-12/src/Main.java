import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guess;

        for(boolean i = true ; i ; )
        {
            System.out.print("Guess my name: ");
            guess = sc.nextLine();

            i = !"Daffy Duck".equals(guess);
        }

    }
}
