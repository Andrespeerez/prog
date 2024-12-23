public class Main
{
    public static void main(String[] args) {

        try{
            for(int k = 0; k < 5; k++)
            {
                System.out.println(100 / k);
            }
        } catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
