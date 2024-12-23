public class Main
{
    public static void main(String[] args)
    {
        imprimeNumeroEnLetra(4);
        imprimeNumeroEnLetra(-2);
        imprimeNumeroEnLetra(6);
        imprimeNumeroEnLetra(10);
    }

    public static void imprimeNumeroEnLetra(int numero)
    {
        switch (numero)
        {
            case 0:
                System.out.println("CERO");
                break;
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVO");
                break;
            default:
                System.out.println("Otro");
        }
    }
}
