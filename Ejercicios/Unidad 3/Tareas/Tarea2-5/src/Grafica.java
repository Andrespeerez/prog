public class Grafica
{
    private String nombre;
    private int vRam;

    public Grafica(String nombre, int vRam)
    {
        this.nombre = nombre;
        this.vRam = vRam;
    }

    public void renderizaImagen()
    {
        System.out.println("Imagen renderizada");
    }
}
