public class Cilindro extends Forma {

    private double radio;
    private double alto;

    public Cilindro(double radio, double alto) {
        super("Cilindro");
        this.radio = radio;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * ( this.radio * this.radio + this.radio * this.alto);
    }
}
