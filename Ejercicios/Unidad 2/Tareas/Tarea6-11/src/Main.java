public class Main
{
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        for ( int j = 0; j < 8; j= j + 2 )
            sumEven = sumEven + j;

        System.out.println(sumEven);

        for ( int j = 1; j < 8; j= j + 2 )
            sumOdd = sumOdd + j;

        System.out.println(sumOdd );
    }
}
