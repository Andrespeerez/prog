public class Main
{
    public static void main(String[] args) {
        String s = "Hello";
        s = duplicate(s);
        String t = "Bye";
        t = duplicate(duplicate(duplicate(t)));
        System.out.println(s + t);
    }

    public static String duplicate(String s) {
        String t = s + s;
        return t;
    }
}
