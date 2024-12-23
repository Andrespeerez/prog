public class Ordenador
{
    private Procesador procesador;
    private Ram ram1;
    private Ram ram2;
    private Grafica grafica;
    private DiscoDuro discoDuro1;
    private DiscoDuro discoDuro2;
    private Estado estado;

    public Ordenador(Procesador pr, Ram ram1, Ram ram2, Grafica grafica, DiscoDuro dd1, DiscoDuro dd2)
    {
        this.procesador = pr;
        this.ram1 = ram1;
        this.ram2 = ram2;
        this.grafica = grafica;
        this.discoDuro1 = dd1;
        this.discoDuro2 = dd2;

        this.estado = Estado.APAGADO;
    }

    public int capacidadTotal()
    {
        return discoDuro1.getCapacidad() + discoDuro2.getCapacidad();
    }

    public void encender()
    {
        this.estado = Estado.ENCENDIDO;
    }

    public void apagar()
    {
        this.estado = Estado.APAGADO;
    }

}
