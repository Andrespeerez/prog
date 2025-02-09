public class VideoMusical extends Video {

    String artista, categoria;

    public VideoMusical() {
        this.artista = "Sin definir";
        this.categoria = "Sin definir";
    }

    public VideoMusical(String titulo, int duracion, String artista, String categoria, int precio) {
        super(titulo, duracion, precio);
        this.artista = artista;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArtista: " + this.artista + "\nCategoria: " + this.categoria;
    }
}
