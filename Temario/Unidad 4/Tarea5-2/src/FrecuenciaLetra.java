public class FrecuenciaLetra {

    char letra;
    int frecuencia;

    public FrecuenciaLetra(char letra) {
        this.letra = letra;
        this.frecuencia = 0;
    }

    public char getLetra() {
        return this.letra;
    }

    public int getFrecuencia() {
        return this.frecuencia;
    }

    public void increaseFrecuencia() {
        this.frecuencia  += 1;
    }
}
