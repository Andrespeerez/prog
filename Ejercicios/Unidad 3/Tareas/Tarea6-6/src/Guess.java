import java.util.Scanner;

public class Guess {

    private final int target;
    private static final int LIM_INFERIOR = 1;
    private static final int LIM_SUPERIOR = 100;

    public Guess() {
        this.target = Guess.LIM_INFERIOR + (int) (Math.random() * Guess.LIM_SUPERIOR);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guess guess = new Guess();

        System.out.print("Write a number between " + Guess.LIM_INFERIOR + " and " + Guess.LIM_SUPERIOR + ": ");
        while(! guess.tryGuess(sc.nextInt())) {
            System.out.print("\n\nTry again\nWrite a number between " + Guess.LIM_INFERIOR + " and " + Guess.LIM_SUPERIOR + ": ");
        }

    }

    public boolean tryGuess(int myGuess) {
        if(myGuess < this.target) {
            System.out.println("Wrong!\nYour guess is smaller than the target");
            return false;
        } else if (myGuess > this.target) {
            System.out.println("Wrong!\nYour guess is greater than the target");
            return false;
        }

        System.out.println("\n\nCongratulations!\nYou guessed the right number! : " + this.target);
        return true;
    }
}