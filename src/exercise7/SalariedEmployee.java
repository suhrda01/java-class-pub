package exercise7;

/**
 *
 * @author suhrda01
 */
public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, String ssn, double salary) {
        super(name, ssn);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public double getNetPay() {
        this.netPay = (salary / 52);
        return netPay;
    }
    
    @Override
    public void printWeeklyCheck() {
        System.out.printf("%s has a salary of $%.2f and earned %.2f this week\n", name, salary, getNetPay());
    }
}
