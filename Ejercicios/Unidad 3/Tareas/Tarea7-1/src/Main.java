public class Main
{
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int n){
        int result = 1;
        while(!(n <= 0)) {
            result *= n;
            n--;
        }
        return result;
    }
}
