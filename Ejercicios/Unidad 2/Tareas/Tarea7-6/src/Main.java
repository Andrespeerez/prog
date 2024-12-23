public class Main
{
    public static void main(String[] args) {
        for (int i = 1; i <= 3 ; i++)
        {
            if(i == 1 || i == 3) System.out.print('+');
            else System.out.print('|');

            for (int j = 1; j <= 10 ; j++)
            {
                if( (i == 1 || i == 3) && j % 2 != 0) System.out.print('<');
                else if( (i == 1 || i == 3) && j % 2 == 0) System.out.print('>');
                else System.out.print(' ');

            }

            if(i == 1 || i == 3) System.out.println('+');
            else System.out.println('|');
        }

    }
}
