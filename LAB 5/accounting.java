/*
LAB 7
5. Write a program to create an Account class containing acc_no, balance as data
members and disp() to display the details. Inherit it in Person class with all
mentioned data members and functions. Person class also has name and
aadhar_no as extra data members of its own. Override disp() function. Create
5 persons‟ details.
*/

class Account {
    int acc_no;
    double balance;

    void disp() {
        System.out.println("The details are acc_no - " + acc_no + " - balance - " + balance);
    }
}

class Person extends Account {
    String name;
    int aadhar_no;

    @Override
    void disp() {
        System.out.println("The details are person are - " + acc_no + " - balance - " + balance + " - name - " + name
                + " - aadhar no - " + aadhar_no);
    }
}

public class accounting {
    public static void main(String args[]) {

        String[] names = { "volvo", "tyson", "mark", "smith", "dwayne" };

        Person p[] = new Person[5];
        
        for (int i = 0; i < names.length; i++) {
            p[i] = new Person();
            p[i].name = names[i];
            p[i].acc_no = i*i*i;
            p[i].aadhar_no = i*i;
            p[i].balance = i;
            p[i].disp();
        }

    }
}
