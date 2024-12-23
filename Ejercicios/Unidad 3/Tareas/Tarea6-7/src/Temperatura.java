public class Temperatura {

    private static final double FACTOR_F_TO_C = 5.0 / 9.0;
    private static final double FACTOR_C_TO_F = 9.0 / 5.0;
    private static final double CONST_F_TO_C = - 32.0;
    private static final double CONST_C_TO_F = 32.0;

    public static double fahrenheitToCelsius (double fahrenheit) {
        return FACTOR_F_TO_C * ( fahrenheit + CONST_F_TO_C);
    }

    public static double celsiusToFahrenheit (double celsius) {
        return FACTOR_C_TO_F * celsius + CONST_C_TO_F;
    }
}