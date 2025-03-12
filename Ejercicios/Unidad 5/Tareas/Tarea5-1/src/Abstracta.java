public abstract class Abstracta {

    public Abstracta() {
        System.out.println("Este es un constructor de clase abstracta");
    }

    public abstract void abstractMethod();

    public void noAbstractMethod() {
        System.out.println("Este es un método normal de clase abstracta");
    }
}
