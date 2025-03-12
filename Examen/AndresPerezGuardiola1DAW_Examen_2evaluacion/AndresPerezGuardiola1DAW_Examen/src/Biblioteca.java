import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {

    private ArrayList<Publicacion> catalogo = new ArrayList<Publicacion>();
    private ArrayList<Publicacion> prestamos = new ArrayList<Publicacion>();

    public void agregarPublicacion(Publicacion p) {
        // Revisa que no exista dupicado
        if (this.catalogo.contains(p)) return;

        this.catalogo.add(p);
    }

    public void prestarPublicacion(String titulo) {
        // mueve de catalogo a prestamos

        // buscar en catálogo
        Publicacion p = buscarPublicacion(this.catalogo, titulo);

        if(p == null) {
            System.out.printf("No se encontró publicacion en catálogo");
            return;
        }

        // elimina en catálogo
        this.catalogo.remove(p);

        // añade en prestamos
        if(this.prestamos.add(p)) {
            System.out.println("Prestamos realizado con éxito\n");
        }

    }

    public void devolverPublicacion(String titulo) {
        // mueve de prestamo a catalogo

        // buscar en prestamos
        Publicacion p = buscarPublicacion(this.prestamos, titulo);

        if(p == null) {
            System.out.printf("No se encontró publicacion en prestamos");
            return;
        }

        // elimina en prestamos
        this.prestamos.remove(p);

        // añade en prestamos
        if(this.catalogo.add(p)) {
            System.out.println("Devolucion realizado con éxito\n");
        }

    }

    public Publicacion buscarPublicacion(ArrayList<Publicacion> list, String titulo) {
        for(int i = 0; i < list.size(); i++) {
            Publicacion p = list.get(i);

            if(p.getTitulo().equalsIgnoreCase(titulo))
                return p;
        }

        return null;
    }

    public Publicacion buscarPublicacionPorAutor(ArrayList<Publicacion> list, String autor) {
        for(int i = 0; i < list.size(); i++) {
            Publicacion p = list.get(i);

            if(p.getAutor().equalsIgnoreCase(autor))
                return p;
        }

        return null;
    }

    public Publicacion buscarPublicacionPorAnio(ArrayList<Publicacion> list, int anioPublicacion) {
        for(int i = 0; i < list.size(); i++) {
            Publicacion p = list.get(i);

            if(p.getAnioPublicacion() == anioPublicacion)
                return p;
        }

        return null;
    }

    public void mostrarCatalogo() {
        mostrarLista(this.catalogo);
    }

    public void mostrarPrestamos() {
        mostrarLista(this.prestamos);
    }

    public void mostrarLista(ArrayList<Publicacion> list) {
        for(Publicacion p : list) {
            p.mostrarInformacion();
        }
    }

    public void ordenarCatalogoPorTitulo() {
        Publicacion[] array = new Publicacion[this.catalogo.size()];
        this.catalogo.toArray(array);

        Arrays.sort(array);

        // No hacemos nada, solo mostramos
        for (int i = 0; i < array.length; i++ ) {
            array[i].mostrarInformacion();
        }

    }
}
