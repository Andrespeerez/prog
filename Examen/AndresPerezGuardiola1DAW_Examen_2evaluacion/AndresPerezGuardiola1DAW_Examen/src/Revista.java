public class Revista extends Publicacion {

    private int numeroEdicion;
    private String categoria;

    public Revista(
            String titulo,
            String autor,
            int anioPublicacion,
            int numeroEdicion,
            String categoria
    ) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.categoria = categoria;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                this + "\nNumero Edicion: " + this.numeroEdicion + "\nCategoria: " + this.categoria
        );
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}