public class Moto extends Vehiculo implements Conducible {

    private TipoManillar tipoManillar;

    public Moto(String marca, String modelo, int anyo, TipoManillar tipoManillar) {
        super(marca, modelo, anyo);
        this.tipoManillar = tipoManillar;
    }

    // pregunta 5
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo Manillar: " + this.tipoManillar);
    }

    public TipoManillar getTipoManillar() {
        return tipoManillar;
    }

    // pregunta 6
    @Override
    public void acelerar() {
        System.out.println("La moto acelera!");
    }

    @Override
    public void frenar() {
        System.out.println("La moto frenaa!");
    }
}
