public class CocheViejo extends Coche {

    public CocheViejo(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar() {
        System.out.println("El " + this.getModelo() + " no arranca");
        System.out.println("Menuda chatarra");
    }
}
