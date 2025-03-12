public abstract class Forma {

    private int numLados;

    public Forma(int numLados) {
        this.numLados = numLados;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public int getNumLados() {
        return numLados;
    }
}
