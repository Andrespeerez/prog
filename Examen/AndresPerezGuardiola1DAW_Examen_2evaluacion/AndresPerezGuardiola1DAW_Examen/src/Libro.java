public class Libro extends Publicacion {

    private String genero;
    private int numPaginas;

    public Libro(
            String titulo,
            String autor,
            int anioPublicacion,
            String genero,
            int numPaginas
    ) {
        super(titulo, autor, anioPublicacion);
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                this + "\nGenero: " + this.genero + "\nNumero Paginas: " + this.numPaginas
        );
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

}
