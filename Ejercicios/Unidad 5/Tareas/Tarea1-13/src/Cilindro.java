public class Cilindro extends Circulo {

    private double altura;

    public Cilindro(double radio, double altura) {
        super(radio);

        if(altura < 0.0d) this.altura = 0.0d;
        else this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getVolumen() {
        return this.altura * this.getArea();
    }
}
