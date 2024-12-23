public class Main {

    public static void main(String[] args) {
        System.out.println(decimalToBinary(247));
    }

    public static String decimalToBinary(int num) {
        if(num == 0) {
            return "";
        }

        return decimalToBinary(num / 2) + (num % 2);
    }
}

