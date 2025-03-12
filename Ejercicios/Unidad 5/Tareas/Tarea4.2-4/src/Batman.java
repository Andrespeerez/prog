public class Batman extends Persona implements SuperHeroe {

    String superpoder;

    public Batman (String name, int edad, String superpoder) {
        super(name, edad);
        this.superpoder = superpoder;
    }

    @Override
    public void activarSuperPoder() {
        System.out.println("Es rico?");
    }

    @Override
    public void desactivarSuperPoder() {
        System.out.println("Deja de ser rico?");
    }
}
