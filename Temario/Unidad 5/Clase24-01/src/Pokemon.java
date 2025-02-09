public class Pokemon {

    int pAtaque, pDefensa, pVida;
    String nombre, tipo;

    public Pokemon() {
        this.pDefensa = 1;
        this.pAtaque = 10;
        this.pVida = 100;
        this.nombre = "Pokemon";
        this.tipo = "Undefined";
    }

    public Pokemon(int pDefensa, int pAtaque, int pVida, String nombre, String tipo) {

        this.pDefensa = pDefensa;
        this.pAtaque = pAtaque;
        this.pVida = pVida;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void atack () {
        System.out.println("Pokemon, al ataque!\n");
    }
}
