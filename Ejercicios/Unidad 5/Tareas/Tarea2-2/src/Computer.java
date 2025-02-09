public class Computer {

    private CPU procesor;
    private RAM[] RAMs;

    public Computer(CPU procesor, RAM[] RAMs) {
        this.procesor = procesor;
        this.RAMs = RAMs.clone();
    }

    public CPU getProcesor() {
        return procesor;
    }

    public RAM[] getRAMs() {
        return RAMs;
    }
}
