public class Comida extends Bienes {

    private double calorias;

    public Comida(String descripcion, double precio, double calorias) {
        super(descripcion, precio);
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Descripcion: " + this.descripcion +
                ";\nPrecio: " + this.precio +
                ";\nCalorias: " + this.calorias + ";";
    }
}
