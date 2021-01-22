import java.util.*;

public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();

        int a = 0, b = 1, c = 0;
        for (int i = 0; i < limit; i++) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
        sc.close();
    }
}
