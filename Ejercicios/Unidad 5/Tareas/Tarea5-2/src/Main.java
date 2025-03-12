public class Main {

    public static void main(String[] args) {

        Employee porHoras = new HourlyEmployee("Jose", "Limpiador", 9.0, 20);
        System.out.println(porHoras.calculateWeeklyPay());

        Employee salariado = new SalaryEmployee("Maria", "Informatico", 300);
        System.out.println(salariado.calculateWeeklyPay());
    }
}
