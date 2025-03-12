public class Estudiante implements Comparable<Estudiante> {

    private String nombre;
    private double altura;
    private int edad;

    public Estudiante(String nombre, double altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    @Override
    public int compareTo(Estudiante o) {
        boolean hasAlturaMayor = this.altura > o.getAltura();
        boolean hasEdadMayor = this.edad > o.getEdad();

        if(hasAlturaMayor) return 1;
        else if (!hasAlturaMayor) return -1;
        else {
            if (hasEdadMayor) return 1;
            else if (hasEdadMayor) return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return nombre + " " + altura + " " + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
