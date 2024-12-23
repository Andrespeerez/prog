public class Persona
{
    private String nombre;
    private String apellido;
    private int edad;

    // CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona()
    {
        this("", "", 0);
    }

    // METHODS
    public boolean esAdolescente()
    {
        return this.getEdad() < 18;
    }

    public String getFullName()
    {
        if(getNombre().isEmpty() && getApellido().isEmpty()) return "";
        if(getNombre().isEmpty()) return getNombre();

        return getNombre() + " " + getApellido();
    }

    public void setAge(int edad)
    {
        setEdad(edad);
    }

    public void setFirstName(String name)
    {
        setNombre(name);
    }

    public void setLastName(String name)
    {
        setApellido(name);
    }

    // GETTERS SETTERS
    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return this.apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public int getEdad()
    {
        return this.edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }
}
