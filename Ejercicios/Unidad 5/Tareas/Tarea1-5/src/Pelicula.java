public class Pelicula extends Video {

    int valoracion;
    String director;

    public Pelicula() {
        // La llamada a Super() es implícita
        this.valoracion = 0;
        this.director = "Sin director";
    }

    public Pelicula(String titulo, int minutos, int valoracion, String director, int precio) {
        super(titulo, minutos, precio);
        this.valoracion = valoracion;
        this.director = director;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nDirector: " + this.director +
                "\nValoracion: " + this.valoracion;

    }
}
