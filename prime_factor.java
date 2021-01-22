import java.util.*;

public class prime_factor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 3 numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;
        if (a > b) {
            if (a > c)
                largest = a;
            else
                largest = c;
        } else {
            if (b > c)
                largest = b;
            else
                largest = c;
        }

        System.out.println("the largest number is" + largest);

        sc.close();
    }
}
