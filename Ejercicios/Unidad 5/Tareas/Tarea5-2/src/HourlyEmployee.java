public class HourlyEmployee extends Employee {

    private double tasaPago;
    private int horas;

    public HourlyEmployee(String name, String cargo, double tasaPago, int horas) {
        super(name, cargo);
        this.tasaPago = tasaPago;
        this.horas = horas;
    }

    @Override
    public double calculateWeeklyPay() {
        return tasaPago * horas;
    }
}
