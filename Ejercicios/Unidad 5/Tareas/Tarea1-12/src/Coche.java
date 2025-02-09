public class Coche extends Vehiculo {

    private String tipoCombustible;
    private int capacidadTanque, numMarchas;

    public Coche() {
        super("Coche generico", 4);
        this.tipoCombustible = "sin definir";
        this.capacidadTanque = 0;
        this.numMarchas = 0;
    }

    public Coche(String nombre, String tipoCombustible, int capacidadTanque, int numMarchas) {
        super(nombre);
        this.tipoCombustible = tipoCombustible;
        this.capacidadTanque = capacidadTanque;
        this.numMarchas = numMarchas;
    }

}
