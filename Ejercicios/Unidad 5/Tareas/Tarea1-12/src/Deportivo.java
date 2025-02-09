public class Deportivo extends Coche {

    boolean modoDeportivo, turbo;

    public void activarDesactivarTurbo() {
        this.turbo = !this.turbo; // invierte boolean
        System.out.println("Turbo: " + this.turbo);

    }

    public void activarDesactivarModoDeportivo() {
        this.modoDeportivo = !this.modoDeportivo; // invierte boolean
        System.out.println("Modo deportivo " + this.modoDeportivo);
    }
}
