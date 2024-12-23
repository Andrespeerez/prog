public class Main {

    public static void main (String[] args) {
        double temperaturaC = 25.0;
        double temperaturaF = Temperatura.celsiusToFahrenheit( temperaturaC );

        System.out.println(temperaturaF + " F -> " + Temperatura.fahrenheitToCelsius(temperaturaF) + " C");
        System.out.println(temperaturaC + " C -> " + Temperatura.celsiusToFahrenheit(temperaturaC) + " F");
    }
}