public class Libro extends Bienes implements Imponible {

    private String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Descripcion: " + this.descripcion +
                ";\nPrecio: " + this.precio +
                ";\nAutor: " + this.autor + ";";
    }

    @Override
    public void calcularImpuesto() {
        System.out.println("Tasa impuesto: " + this.precio * Imponible.TASA);
    }

    public String getAutor() {
        return autor;
    }
}
