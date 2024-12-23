public class Coche
{
    private int puertas;
    private double peso;
    private double precio;
    private String motor;
    private String modelo;
    private String color;
    private String marca;

    public Coche(int puertas, double peso, double precio, String motor, String modelo, String color, String marca)
    {
        this.puertas = puertas;
        this.peso = peso;
        this.precio = precio;
        this.motor = motor;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }

    public int getPuertas()
    {
        return this.puertas;
    }

    public void setPuertas(int puertas)
    {
        this.puertas = puertas;
    }

    public double getPeso()
    {
        return this.peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getPrecio()
    {
        return this.precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
