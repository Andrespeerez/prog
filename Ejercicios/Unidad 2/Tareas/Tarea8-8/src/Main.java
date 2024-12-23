public class Main
{
    public static void main(String[] args) {
        int m = 50;

        try {
            System.out.println("Entrando en el try");
            if (m > 100)
                throw new Exception(m + " es muy grande");

            System.out.println("Saliendo del bloque try");
        } catch (Exception e)
        {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
