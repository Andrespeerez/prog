public class Electrico extends Coche {

    public Electrico(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar() {
        super.arrancar();
        System.out.println("No hace ruido!");
    }
}
