import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void main(String[] args)
    {
        printMyName();

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formatted = formatter.format(ldt);
        System.out.println(formatted);
    }

    private static void printMyName()
    {
        String myNameAscii =
                "\n   A      n     n  DDDD     rrrrr   EEEEEE   ssssss"+
                "\n  A A     n n   n  D    D   r    r  E       s"+
                "\n AAAAA    n  n  n  D     D  rrrrr   EEEE     ssssss"+
                "\nA     A   n   n n  D    D   r  r    E              s  "+
                "\nA     A   n     n  DDDD     r   r   EEEEEE   ssssss     \n";
        System.out.println(myNameAscii);
    }

}
