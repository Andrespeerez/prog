public class MainEncapsulacion {

    public static void main(String[] args) {

        Impresora imp1 = new Impresora(false);

        System.out.println("Imprime 20 páginas : Hojas Necesarias : " + imp1.imprimirPaginas(20));
        System.out.println("Imprime 30 páginas : Hojas Necesarias : " + imp1.imprimirPaginas(30));
        System.out.println("Paginas totales Impresas : " + imp1.getNumeroPaginasImpresas());
        System.out.println();
        System.out.println("Imprime 1 página : Toner Insuficiente : " + imp1.imprimirPaginas(1));

        System.out.println("Recargar Toner al 101% : " + imp1.recargarToner(101));
        System.out.println("Recargar Toner al 100% : " + imp1.recargarToner(100));

        // A dos caras
        Impresora imp2 = new Impresora(true);
        System.out.println("\nImpresora a dos caras: ");
        System.out.println("Imprime 20 páginas : Hojas Necesarias : " + imp2.imprimirPaginas(20));
        System.out.println("Imprime 30 páginas : Hojas Necesarias : " + imp2.imprimirPaginas(30));
        System.out.println("Paginas totales Impresas : " + imp2.getNumeroPaginasImpresas());

    }
}
