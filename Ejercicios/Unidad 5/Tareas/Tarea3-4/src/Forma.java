public class Forma {

    private String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return 0d;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
