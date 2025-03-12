public interface Imponible {

    double TASA = 0.06;

    void calcularImpuesto();

    default void calcularImpuesto(Bienes bien) {
        System.out.println(bien.precio * TASA);
    }
}
