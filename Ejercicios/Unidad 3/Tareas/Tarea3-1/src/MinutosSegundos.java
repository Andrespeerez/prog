public class MinutosSegundos
{

    public static String obtenerMensajeDuracion(int minutos, int segundos)
    {
        if(! (minutos >= 0) ) return "Valor inválido";
        if(! (segundos >= 0 && segundos < 60) ) return "Valor inválido";

        return minutos/60 + "h " + minutos%60 + "m " + segundos + "s";
    }

    public static String obtenerMensajeDuracion(int segundos)
    {
        int minuto = segundos/60;
        int segundo = segundos%60;
        return obtenerMensajeDuracion(minuto, segundo);
    }
}
