public class Main
{
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 1; j < i; j++)
            {
                if (i == 4)
                {
                    break;
                }
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
