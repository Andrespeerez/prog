public class Ejercicio8 {

    public static void main(String[] args) {

        double[] array = {-49.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42};

        System.out.println("Media: " + media(array));


    }

    public static double media(double[] array) {
        double media = 0.0;

        for(double value: array) {
            media += value;
        }

        media = media / array.length;

        return media;
    }
}
