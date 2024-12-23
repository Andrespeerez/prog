public class Main
{
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println(contador);
            if(contador % 4 == 0)
            {
                System.out.println("Múltiplo de 4 encontrado. Salir!");
                contador = 10;
            }
            contador++;
        } while (contador <= 10);
    }
}
