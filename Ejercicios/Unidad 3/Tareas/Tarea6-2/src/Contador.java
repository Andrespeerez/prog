class Contador {

    int contador;
    static int staticContador;

    public Contador() {
        contador++;
        staticContador++;
    }

    public int getContador() {
        return contador;
    }

    public static int getStaticContador() {
        return staticContador;
    }
}
