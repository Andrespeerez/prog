public class Circulo {

    private double radio;

    public Circulo(double radio) {
        if(radio < 0.0d) this.radio = 0.0d;
        else this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public double getArea() {
        return this.radio * this.radio * Math.PI;
    }
}
