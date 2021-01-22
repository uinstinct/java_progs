import java.util.Scanner;

class electricitybill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the initial reading and final readin");
        int initial = sc.nextInt();
        int f = sc.nextInt();

        int units = f -initial;

        double bill = 0;

        if (units < 100) {
            bill = units * 0.25;
        } else if (units < 300) {
            bill = 100 * 1.20 + (units - 100) * 2;
        } else if (units > 300) {
            bill = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }

        System.out.println("Bill to pay : " + bill);
        sc.close();
    }
}