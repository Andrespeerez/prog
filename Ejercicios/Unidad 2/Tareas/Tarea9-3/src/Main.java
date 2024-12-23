import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstNum;
        double secondNum;
        double product;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number to multiply: ");
        firstNum = in.nextDouble();

        System.out.print("Enter second number to multiply: ");
        secondNum = in.nextDouble();

        product = secondNum * firstNum;

        System.out.print(firstNum + " * ");
        System.out.print(secondNum + " = ");
        System.out.println(product);
    }
}
