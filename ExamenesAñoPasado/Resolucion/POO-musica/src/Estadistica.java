public class Estadistica {

    private Cancion cancion;
    private final int precioDescarga;

    public Estadistica (Cancion cancion, int precioDescarga) {
        this.cancion = cancion;
        this.precioDescarga = precioDescarga;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public int getPrecioDescarga() {
        return precioDescarga;
    }


}
