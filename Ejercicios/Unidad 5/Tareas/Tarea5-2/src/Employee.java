public abstract class Employee implements Salvable {

    private String nombre;
    private String cargo;

    public Employee(String name, String cargo) {
        this.nombre = name;
        this.cargo = cargo;
    }

    public abstract double calculateWeeklyPay();

    @Override
    public void salvar() {
        System.out.println("Salvado!");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
