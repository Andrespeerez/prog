public class Calculadora
{
    private double primerNumero;
    private double segundoNumero;

    // CONSTRUCTORES
    public Calculadora()
    {
        this(0, 0);
    }

    public Calculadora(double primerNumero, double segundoNumero)
    {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
    }

    public double getResultadoSuma()
    {
        return primerNumero + segundoNumero;
    }

    public double getResultadoResta()
    {
        return primerNumero - segundoNumero;
    }

    public double getMultiplicationResult()
    {
        return primerNumero * segundoNumero;
    }

    public double getDivisionResult()
    {
        if(segundoNumero == 0)
        {
            return 0;
        }

        return primerNumero / segundoNumero;
    }


    // GETTERS Y SETTERS
    public double getPrimerNumero()
    {
        return primerNumero;
    }

    public void setPrimerNumero(double primerNumero)
    {
        this.primerNumero = primerNumero;
    }

    public double getSegundoNumero()
    {
        return segundoNumero;
    }

    public void setSegundoNumero(double segundoNumero)
    {
        this.segundoNumero = segundoNumero;
    }
}
