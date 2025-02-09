public class B extends A {

    public B() {
        super();
    }

    @Override
    public void saltar() {
        System.out.println("No salta");
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
