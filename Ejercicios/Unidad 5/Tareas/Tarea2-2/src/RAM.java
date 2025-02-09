public class RAM {

    private int storageCapacity;
    private double clockSpeed;

    public RAM(int storageCapacity, double clockSpeed) {
        this.storageCapacity = storageCapacity;
        this.clockSpeed = clockSpeed;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }
}
