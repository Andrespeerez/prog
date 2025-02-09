public class CPU {

    private String name;
    private int nCore;
    private double clockSpeed;
    private boolean isOverClock;

    public CPU(String name, int nCore, double clockSpeed) {
        this.name = name;
        this.nCore = nCore;
        this.clockSpeed = clockSpeed;
    }

    public void activateOverClock() {
        this.isOverClock = !this.isOverClock;
        System.out.println("Overclock? " + this.isOverClock);
    }

    public String getName() {
        return this.name;
    }

    public int getNCore() {
        return this.nCore;
    }

    public double getClockSpeed() {
        return this.clockSpeed;
    }
}
