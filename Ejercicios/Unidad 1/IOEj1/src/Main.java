import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduce un dato tipo byte: ");
        byte myByte = sc.nextByte();
        System.out.print("\nIntroduce un dato tipo short: ");
        short myShort = sc.nextShort();
        System.out.print("\nIntroduce un dato tipo int: ");
        int myInt = sc.nextInt();
        System.out.print("\nIntroduce un dato tipo long: ");
        long myLong = sc.nextLong();
        System.out.print("\nIntroduce un dato tipo boolean: ");
        Boolean myBoolean = sc.nextBoolean();
        System.out.print("\nIntroduce un dato tipo string: ");
        String myString = sc.next();

        System.out.println("\n\nDatos obtenidos:");
        System.out.println("Byte : " + myByte + "; Short : " + myShort + "; Int : " + myInt +
                "\nLong : " + myLong + "; Boolean : " + myBoolean + "; String : " + myString);

    }
}
