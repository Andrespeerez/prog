public class Hola
{
    public static void main(String[] args) {
        int contador = 1;
        int limite = 5;
        String mensaje = "Hola caracola";

        do {
           System.out.println(mensaje);
           contador++;
        } while (contador <= limite);

    }
}
