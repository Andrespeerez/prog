public class Spiderman extends Persona implements SuperHeroe {

    String superpoder;

    public Spiderman (String name, int edad, String superpoder) {
        super(name, edad);
        this.superpoder = superpoder;
    }

    @Override
    public void activarSuperPoder() {
        System.out.println("Trepa cual araña");
    }

    @Override
    public void desactivarSuperPoder() {
        System.out.println("Deja de trepar");
    }
}