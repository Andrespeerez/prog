public class DiscoDuro
{
    private String nombre;
    private int capacidad;
    private double velocidadLectura;
    private double velocidadEscritura;

    public DiscoDuro(String nombre, int capacidad, double vLectura, double vEscritura)
    {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.velocidadLectura = vLectura;
        this.velocidadEscritura = vEscritura;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getCapacidad()
    {
        return capacidad;
    }

    public double getVelocidadLectura()
    {
        return velocidadLectura;
    }

    public double getVelocidadEscritura()
    {
        return velocidadEscritura;
    }


}
