/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author suhrda01
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee he = new HourlyEmployee("Bob", "123-45-6789", 7.25, 10);
        System.out.println(he.getName());
        System.out.println(he.getSsn());
        System.out.println(he.getWageRate());
        System.out.println(he.getHours());
        System.out.println(he.getNetPay());
        he.printWeeklyCheck();
        SalariedEmployee se = new SalariedEmployee("Bob", "123-45-6789", 50000);
        System.out.println(se.getName());
        System.out.println(se.getSsn());
        System.out.println(se.getSalary());
        System.out.println(se.getNetPay());
        se.printWeeklyCheck();
    }
    
}
