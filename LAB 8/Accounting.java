import java.util.*;

class LessBalance extends Exception {
    LessBalance() {
        System.out.println("Minimum Balance should be 500");
    }

    LessBalance(String s) {
        super(s);
    }
}

class Bank {
    int bal;

    Bank() {
        bal = 500;
    }

    int show() {
        return bal;
    }

    void deposit(int amt) {
        bal = bal + amt;
    }

    void withdraw(int amt) throws LessBalance {
        if (bal - amt > 500)
            bal = bal - amt;
        else
            throw new LessBalance();
    }
}

class Accounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();
        System.out.println("Enter your choice");
        try {
            while (true) {
                int ch = sc.nextInt(), amt;
                switch (ch) {
                case 1:
                    System.out.print("Enter deposit : ");
                    amt = sc.nextInt();
                    obj.deposit(amt);
                    break;
                case 2:
                    System.out.print("Enter withdraw : ");
                    amt = sc.nextInt();
                    obj.withdraw(amt);
                    break;
                case 3:
                    System.out.println("The current balance is " + obj.bal);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid operation");
                }
            }
        } catch (LessBalance e) {
            System.out.println(e + " Exception Occured");
        }
        sc.close();
    }
}