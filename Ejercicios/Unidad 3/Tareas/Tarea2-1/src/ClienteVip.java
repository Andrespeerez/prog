public class ClienteVip
{
    private String nombre;
    private double limiteCredito;
    private String email;
    private TipoVip tipoVip;

    public ClienteVip()
    {
        this("", 0, "", TipoVip.NORMAL);
    }

    public ClienteVip(String nombre, String email)
    {
        this(nombre, 0, email, TipoVip.NORMAL);
    }

    public ClienteVip(String nombre, double limiteCredito, String email, TipoVip tipoVip)
    {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.email = email;
        this.tipoVip = tipoVip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoVip getTipoVip() {
        return tipoVip;
    }

    public void setTipoVip(TipoVip tipoVip) {
        this.tipoVip = tipoVip;
    }
}
