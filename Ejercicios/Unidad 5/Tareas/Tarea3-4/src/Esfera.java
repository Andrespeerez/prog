public class Esfera extends Forma {

    private double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * this.radio * this.radio;
    }
}
