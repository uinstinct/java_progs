import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the values");

        str = sc.next();

        int i = 0,  flag = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = 1;
            }
            break;
        }
        if (flag == 1) {
            System.out.println("not plaindrome");
        } else {
            System.out.println("plaindrome");
        }

        sc.close();
    }
}