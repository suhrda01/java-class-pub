package exercise7;

/**
 *
 * @author suhrda01
 */
public class Employee {
    protected String name;
    protected String ssn = "000-00-0000";
    protected double netPay;
    
    public Employee(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    protected double getNetPay() {
        return netPay;
    }
    
    protected void printWeeklyCheck() {
    }

}
