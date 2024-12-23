public class Main {

    public static void main(String[] args) {
        int size = 3;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ( (i == 0 && j < size / 2) || (i == size - 1 && j < size / 2) ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
