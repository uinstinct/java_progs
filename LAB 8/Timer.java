import java.util.*;

class SecException extends Exception {
    public SecException(String s) {
        super(s);
    }
}

class MinException extends Exception {
    MinException(String s) {
        super(s);
    }
}

class HrsException extends Exception {
    HrsException(String s) {
        super(s);
    }
}

public class Timer {
    static void checkTime(int h, int m, int s) throws HrsException, MinException, SecException {
        String temp = "Invalid input for ";

        if (h > 24 || h < 0)
            throw new HrsException(temp + "hour");
        else if (m > 60 || m < 0)
            throw new MinException(temp + "minute");
        else if (s > 60 || s < 0)
            throw new SecException(temp + "seconds");
        else
            System.out.println("The entered value is correct - " + h + " : " + m + " : " + s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hours ");
        int h = sc.nextInt();
        System.out.print("Enter the minutes ");
        int m = sc.nextInt();
        System.out.print("Enter the seconds ");
        int s = sc.nextInt();

        try {
            checkTime(h, m, s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}