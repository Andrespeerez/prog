public class Ejercicio5 {
    public static void main(String[] args) {
        int[] pagoSemanal = {987, 688, 1324, 450, 887, 801};
        int sum = 0;

        for(int j = 0; j < pagoSemanal.length; j++) {
            sum += pagoSemanal[j];
        }



        System.out.println(sum);
    }
}
