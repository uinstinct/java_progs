package marketing;

import general.Employee;

class MySalesman extends Employee {
    double TA;

    public void alloance() {
        Employee obj1 = new Employee();
        TA = 0.5 * (obj1.earning(45000, 65));
        System.out.println("Travelling alloance is:" + TA);
    }
}

public class my_employee {
    public static void main(String[] args) {
        Salesman obj2 = new MySalesman();
        obj2.alloance();
    }
}