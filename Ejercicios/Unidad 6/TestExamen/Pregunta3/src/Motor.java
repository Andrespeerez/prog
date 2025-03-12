public class Motor {
    // pregunta 4
    private int potencia;
    private TipoCombustible tipoCombustible;

    public Motor(int potencia, TipoCombustible tipoCombustible) {
        this.potencia = potencia;
        this.tipoCombustible = tipoCombustible;
    }

    public int getPotencia() {
        return potencia;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
}
