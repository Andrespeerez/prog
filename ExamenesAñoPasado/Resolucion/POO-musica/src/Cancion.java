public class Cancion {

    private String nombre;
    private final String autor;
    private int duracion;

    public Cancion (String nombre, String autor) {
        this(nombre, autor, 100);
    }

    public Cancion (String nombre, String autor, int duracion) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setDuracion (int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion () {
        return this.duracion;
    }
}
