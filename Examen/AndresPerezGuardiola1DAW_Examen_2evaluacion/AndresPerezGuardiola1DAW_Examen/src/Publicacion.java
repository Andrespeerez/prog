public abstract class Publicacion implements Comparable<Publicacion> {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Publicacion (String titulo,
                        String autor,
                        int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public abstract void mostrarInformacion();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nAño Publicacion: " + this.anioPublicacion;
    }

    @Override
    public int compareTo(Publicacion publicacion) {
        return this.titulo.compareTo(publicacion.getTitulo());
    }
}
