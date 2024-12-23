public class Cubo {

    private int lado;

    public Cubo(int lado) {
        this.lado = lado;
    }

    public int area() {
        int numeroCaras = 6;
        return numeroCaras * this.lado * this.lado;
    }

    public int volumen() {
        // lado^3
        return this.lado * this.lado * this.lado;
    }
}
