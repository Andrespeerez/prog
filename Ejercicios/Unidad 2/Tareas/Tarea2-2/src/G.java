public class G
{
    public static void main(String[] args)
    {
        int k = 1;
        switch (k) {
            case 1:
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default");
        }

    }
}
