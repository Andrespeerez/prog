package Interfaces;

public interface Imponible  {

    double TASA_DE_IMPUESTO = 0.06;

    void calcularIva();
    void valorFinal();
    boolean exencionImpuesto();

    default void saludar() {
        System.out.println("Hola!");
    }
}
