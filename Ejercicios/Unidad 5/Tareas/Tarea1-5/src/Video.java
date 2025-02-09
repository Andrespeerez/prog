public class Video {

    String titulo;
    int minutos, precio;

    public Video() {
        this("Undefined", 0, 10);
    }

    public Video(String titulo, int minutos, int precio) {
        this.titulo = titulo;
        this.minutos = minutos;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo +
                "\nMinutos: " + this.minutos +
                "\nPrecio: " + this.precio;
    }
}
