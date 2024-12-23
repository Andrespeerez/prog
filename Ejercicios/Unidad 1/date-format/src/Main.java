import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd-MM-yyyy hh:mm:ss a");

        String formatted = formatter.format(ldt);
        System.out.println(formatted);

    }
}
