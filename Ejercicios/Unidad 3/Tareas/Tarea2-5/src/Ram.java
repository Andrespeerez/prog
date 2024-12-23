public class Ram
{
    private String nombre;
    private int capacidad;
    private int velocidad;

    public Ram(String nombre, int capacidad, int velocidad)
    {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getCapacidad()
    {
        return capacidad;
    }
}
