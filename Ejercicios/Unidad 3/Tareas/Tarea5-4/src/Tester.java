class Tester {
    public static void main ( String[] args ) {
        Punto pt = new Punto();
        System.out.println("x: " + pt.x+ " y: " + pt.y);
        PuntoTester tester = new PuntoTester();
        tester.print(pt);
        System.out.println("x: " + pt.x+ " y: " + pt.y);
    }
}
