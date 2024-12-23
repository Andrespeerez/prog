import java.util.Scanner;

public class Main
{
    public static void main( String [] args ) {
        double celsius;
        double fahrenheit;
        Scanner in = new Scanner(System.in);
        fahrenheit = in.nextDouble();
        celsius = 5d/9d * fahrenheit - 32;
        System.out.println(fahrenheit + "ºF = ");
        System.out.println(celsius + "ºC");
    }
}
