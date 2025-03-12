public class Periodico extends Publicacion {

    private String fechaPublicacion;
    private String editorial;

    public Periodico(
            String titulo,
            String autor,
            int anioPublicacion,
            String fechaPublicacion,
            String editorial
    ) {
        super(titulo, autor, anioPublicacion);
        this.fechaPublicacion = fechaPublicacion;
        this.editorial = editorial;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                this + "\nFecha Publicacion: " + this.fechaPublicacion + "\nEditorial: " + this.editorial
        );
    }
}
