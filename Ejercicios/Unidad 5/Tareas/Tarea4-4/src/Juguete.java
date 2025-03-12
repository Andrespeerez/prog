public class Juguete extends Bienes implements Imponible {

    private int edadMinima;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Descripcion: " + this.descripcion +
                ";\nPrecio: " + this.precio +
                ";\nEdad Minima: " + this.edadMinima + ";";
    }

    @Override
    public void calcularImpuesto() {
         System.out.println("Tasa impuesto: " + this.precio * Imponible.TASA);
    }
}
