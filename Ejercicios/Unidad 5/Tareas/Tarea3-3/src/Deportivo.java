public class Deportivo extends Coche {

    public Deportivo(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar() {
        super.arrancar();
        System.out.println("Suena increible!");
    }
}
