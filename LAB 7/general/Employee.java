package general;

import java.util.Scanner;

public class Employee {
    protected int empid;
    private String name;
    public double basic, DA, HRA;

    public double earning(double basic, int empid) {
        this.basic = basic;
        this.empid = empid;
        DA = 0.8 * basic;
        HRA = 0.15 * basic;
        double earnings = basic + DA + HRA;
        System.out.println("The total earning is:" + earnings);
        System.out.println("Employee id is:" + empid);

        return earnings;
    }

    public static void main(String[] args) {

        System.out.println("Enter the basic salary and empid:");
        double basic;
        int empid;
        Scanner sc = new Scanner(System.in);
        basic = sc.nextDouble();
        empid = sc.nextInt();
        Employee obj = new Employee();
        obj.earning(basic, empid);
    }
}