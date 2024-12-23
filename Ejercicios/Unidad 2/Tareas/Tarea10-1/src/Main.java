public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int puntuacion = 5000;
        int nivelCompletado = 5;
        int bonus = 10;

        int score = calcularPuntuacion(gameOver, puntuacion, nivelCompletado, bonus);
        System.out.println(score);

        //otra forma de hacerlo es pasarle directamente el valor de las variables
        score = calcularPuntuacion(true, 1000, 10, 30);
        System.out.println(score);



        mostrarPosicionRankinPuntuaciones("Andres", calcularPosicionRankingPuntuaciones(1500));
        mostrarPosicionRankinPuntuaciones("Sara", calcularPosicionRankingPuntuaciones(900));
        mostrarPosicionRankinPuntuaciones("Michel", calcularPosicionRankingPuntuaciones(400));
        mostrarPosicionRankinPuntuaciones("Alvaro", calcularPosicionRankingPuntuaciones(30));





    }

    public static int calcularPuntuacion(boolean gameOver, int puntuacion, int nivelCompletado, int bonus) {
        int puntuacionFinal = -1;
        if (gameOver) {
            puntuacionFinal = puntuacion + (nivelCompletado * bonus);
            puntuacionFinal += 100;
        }
        return puntuacionFinal;
    }

    public static void mostrarPosicionRankinPuntuaciones(String nombre, int posicion){
        System.out.println(nombre + " consiguió llegar a la posición " + posicion + " en el ranking de puntuaciones.");
    }

    public static int calcularPosicionRankingPuntuaciones(int puntuacion){
        int position = 4;
        if(puntuacion >= 1000) position = 1;
        else if(puntuacion >= 500) position = 2;
        else if(puntuacion >= 100) position = 3;
        return position;
    }

}
