public class SubClase extends Abstracta {

    public SubClase() {
        System.out.println("Este es el contructor de subclase");
    }

    @Override
    public void abstractMethod() {
        System.out.println("Este es un método abstracto implementado en una clase no abstracta");
    }
}
