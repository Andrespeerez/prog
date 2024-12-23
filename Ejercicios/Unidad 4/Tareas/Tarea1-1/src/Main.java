public class Main {

    public static void main(String[] args) {
        int[] array = {23, 38, 14, -3, 0, 14, 9, 103, 0, -56};

        System.out.println(array[6]++);
        System.out.println(array[6]);

        int[] data = new int[5];
        data[0] = 2;
        data[1] = 54;
        data[2] = 30;

        System.out.println("data[0] " + data[0]);
        System.out.println("data[1] " + data[1]);
        System.out.println("data[2] " + data[2]);
        System.out.println("data[3] " + data[3]);
        System.out.println("data[4] " + data[4]);

    }
}
