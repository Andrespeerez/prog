public class Main
{
    public static void main(String[] args) {
        Ascensor miAscensor = new Ascensor(-2, 10);

        miAscensor.llamarAscensor(3);
        miAscensor.llamarAscensor(3);
        miAscensor.llamarAscensor(6);
        miAscensor.llamarAscensor(-1);
        miAscensor.llamarAscensor(-5);
        miAscensor.llamarAscensor(12);
        miAscensor.llamarAscensor(0);
    }
}
