import java.util.*;

public class weekday {

    static void month() {

        System.out.println("enter the month of the year");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        m = m % 12;

        switch (m) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

        sc.close();

    }

    static void week() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day of the month");
        int d = sc.nextInt();
        d = (d - 1) % 7;

        String w = "";

        switch (d) {
            case 0:
                w = "Monday";
                break;
            case 1:
                w = "Tuesday";
                break;
            case 2:
                w = "Wednesday";
            case 3:
                w = "Thurday";
                break;
            case 4:
                w = "Friday";
                break;
            case 5:
                w = "Saturday";
                break;
            case 6:
                w = "Sunday";
                break;
        }

        System.out.println("The week day is " + w);

        sc.close();
    }

    public static void main(String args[]) {
        System.out.println("1 for weekday and 2 for weekday");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        if(ch==1) week();
        else month();

        sc.close();

    }
}
