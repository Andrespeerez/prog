public class Main
{
    public static void main(String[] args)
    {
        System.out.println(hayQueDespertarse(false, 22));
    }

    public static boolean hayQueDespertarse(boolean ladrido, int horaDelDia)
    {
        if (ladrido)
        {
            if (horaDelDia < 0 || horaDelDia > 23) return false;
            if (horaDelDia <= 8 || horaDelDia >= 22) return true;
        }
        return false;
    }
}
