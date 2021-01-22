import java.util.*;

public class grade {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        if (n >= 90 && n <= 100) {
            System.out.println("O grade");
        } else if (n >= 80 && n < 90) {
            System.out.println("E grade");
        } else if (n >= 70 && n < 80) {
            System.out.println("A grade");
        } else if (n >= 60 && n < 70) {
            System.out.println("B grade");
        } else if (n >= 50 && n < 60) {
            System.out.println("C grade");
        } else if (n >= 40 && n < 50) {
            System.out.println("D grade");
        } else {
            System.out.println("you are fail");
        }
        sc.close();
    }
}