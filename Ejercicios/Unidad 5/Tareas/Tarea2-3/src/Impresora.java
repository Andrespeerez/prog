public class Impresora {

    private int nivelToner;
    private int numeroPaginasImpresas;
    private boolean dobleCara;

    public Impresora(boolean dobleCara) {
        this.nivelToner = 100;
        this.dobleCara = dobleCara;
        this.numeroPaginasImpresas = 0;
    }

    public int getNivelToner() {
        return nivelToner;
    }

    public int getNumeroPaginasImpresas() {
        return numeroPaginasImpresas;
    }

    public int recargarToner(int recarga) {
        if(recarga < 0) return -1;

        int valorFinal = this.nivelToner + recarga;
        if(valorFinal > 100) return -1;

        this.nivelToner = valorFinal;

        return this.nivelToner;
    }

    public int imprimirPaginas(int nPaginasImprimir) {
        int paginas;
        int consumo = 2;
        int consumoTotal = consumo * nPaginasImprimir;

        if(consumoTotal > nivelToner)  {
            System.out.println("Tinta insuficiente. Consumo: " + consumoTotal);
            return -1;
        }

        if(this.dobleCara) paginas = (int) Math.ceil(nPaginasImprimir / 2.0);
        else paginas = nPaginasImprimir;

        this.numeroPaginasImpresas += paginas;
        this.nivelToner -= paginas * consumo;
        System.out.println("Nivel Actual de Toner: " + this.nivelToner);
        return paginas;
    }
}
