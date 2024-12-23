public class bucle
{
    public static void main(String[] args) {
        int contador = 1;
        final int LIMITE = 25;

        while (contador <= LIMITE)
        {
            System.out.println("Contador es " + contador);
            contador = contador + 4;
        }

    }
}
