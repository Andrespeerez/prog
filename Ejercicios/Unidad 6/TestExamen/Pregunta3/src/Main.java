import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Moto moto1 = new Moto("Benelli", "TRK 702", 2025, TipoManillar.DRAG_BAR);
        Moto moto2 = new Moto("Yamaha", "Tenere 700", 2025, TipoManillar.CLIP_ON);
        Auto auto1 = new Auto("Ferrari", "SF90", 2025, 3, 750, TipoCombustible.GASOLINA);

        moto1.mostrarInfo();
        System.out.println();
        moto2.mostrarInfo();
        System.out.println();
        auto1.mostrarInfo();
        System.out.println();

        // pregunta 6
        moto1.acelerar();
        moto1.frenar();
        System.out.println();

        auto1.acelerar();
        auto1.frenar();

        // pregunta 7
        List<Auto> misCoches = new ArrayList<Auto>();

        Auto auto2 = new Auto("Lamborghini", "Huracan", 2025, 3, 600, TipoCombustible.GASOLINA);
        Auto auto3 = new Auto("Peugeot", "206", 2006, 5, 130, TipoCombustible.DIESEL);
        misCoches.add(auto1);
        misCoches.add(auto2);
        misCoches.add(auto3);

        System.out.println(buscarModelo(misCoches, "206"));


    }

    // pregunta 7
    public static void mostrarAuto(List<Auto> autos) {
        for (int i = 0; i < autos.size(); i++) {
            System.out.println(i + ", modelo: " + autos.get(i).getModelo());
        }
    }

    // pregunta 7
    public static Optional<Auto> buscarModelo(List<Auto> autos, String modelo) {
        for (Auto auto : autos) {
            if (modelo.equalsIgnoreCase(auto.getModelo()))
                return Optional.of(auto);
        }

        return Optional.empty();
    }


}
