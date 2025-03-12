package Interfaces;

public class Coche extends Vehiculo implements Imponible {

    @Override
    public void calcularIva() {

    }

    @Override
    public void valorFinal() {

    }

    @Override
    public boolean exencionImpuesto() {
        return false;
    }

    @Override
    public void encender() {
        System.out.println("Se encenció el Coche");
    }
}
