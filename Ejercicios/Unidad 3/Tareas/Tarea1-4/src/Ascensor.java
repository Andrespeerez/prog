public class Ascensor
{
    private int piso;
    private int ultimoPiso;
    private int primerPiso;

    public Ascensor(int primerPiso, int ultimoPiso)
    {
        this.primerPiso = primerPiso;
        this.ultimoPiso = ultimoPiso;
        this.piso = primerPiso;
    }

    public void llamarAscensor(int pisoActual)
    {
        if (pisoActual < getPrimerPiso() || pisoActual > getUltimoPiso()) {
            System.out.println("Piso no válido");
            return;
        }

        while (pisoActual > piso) {
            piso++;
            System.out.println("Subiendo, piso actual: " + piso);
        }

        while (pisoActual < piso)  {
            piso--;
            System.out.println("Bajando, piso actual: " + piso);
        }

        System.out.println("Se abren las puertas. Piso actual es " + piso);
    }

    public int getPiso()
    {
        return piso;
    }

    public void setPiso(int piso)
    {
        this.piso = piso;
    }

    public int getPrimerPiso()
    {
        return primerPiso;
    }

    public void setPrimerPiso(int primerPiso)
    {
        this.primerPiso = primerPiso;
    }

    public int getUltimoPiso()
    {
        return ultimoPiso;
    }

    public void setUltimoPiso(int ultimoPiso)
    {
        this.ultimoPiso = ultimoPiso;
    }
}
