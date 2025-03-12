public class SalaryEmployee extends Employee {

    private double salario;

    public SalaryEmployee(String name, String cargo, double salario) {
        super(name, cargo);
        this.salario = salario;
    }

    @Override
    public double calculateWeeklyPay() {
        return salario;
    }
}
