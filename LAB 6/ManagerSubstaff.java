/*
LAB 8
3. Define an interface with three methods – earnings(), deductions() and bonus()
and define a Java class „Manager‟ which uses this interface without
implementing bonus() method. Also define another Java class „Substaff‟ which
extends from „Manager‟ class and implements bonus() method. Write the
complete program to find out earnings, deduction and bonus of a sbstaff with
basic salary amount entered by the user as per the following guidelines –
earnings basic + DA (80% of basic) + HRA (15% of basic)
deduction PF 12% of basic
bonus 50% of basic
*/

import java.util.*;

interface AnInterface {
    void earnings(int basic);

    void deductions(int basic);

    void bonus(int basic);
}

class Manager implements AnInterface {
    public void earnings(int basic) {
        double earn = basic + 0.80 * basic + 0.15 * basic;
        System.out.println("Earning is " + earn);
    }

    public void deductions(int basic) {
        double deduct = 0.12 * basic;
        System.out.println("Deduction is " + deduct);
    }

}

public class Substaff extends Manager {

    public void bonus(int basic) {
        double b = 0.50 * basic;
        System.out.println("Bonus is " + b);
    }
}

public class ManagerSubstaff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the basic");
        int basic = sc.nextInt();

        Manager m = new Manager();
        m.earnings(basic);
        m.deductions(basic);

        Substaff s = new Substaff();
        s.bonus(basic);

        sc.close();
    }
}
