public class Main {

    public static void main(String[] args) {
        CPU cpu = new CPU("AMR Ryzen 5 3600x", 6, 4.2);
        RAM ram1 = new RAM(16, 3600);
        RAM ram2 = new RAM(16, 3600);
        RAM[] rams = {ram1, ram2};

        Computer myComputer = new Computer(cpu, rams);

        myComputer.getProcesor().activateOverClock();
        System.out.println("Procesor SpeedClock "+ myComputer.getProcesor().getClockSpeed());

        for (int i = 0; i < myComputer.getRAMs().length; i++) {
            System.out.println("RAM " + i + " SpeedClock: " + myComputer.getRAMs()[i].getClockSpeed());
        }

    }
}
