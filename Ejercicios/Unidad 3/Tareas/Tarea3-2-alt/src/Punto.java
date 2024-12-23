public class Punto {

    private int x;
    private int y;

    public Punto() {

    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distancia(Punto punto) {
        int deltaX = this.x - punto.x;
        int deltaY = this.y - punto.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double distancia(int x, int y) {
        int deltaX = this.x - x;
        int deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}