import java.util.*;

public class stringss {
    public static void main(String[] args) {
        System.out.println("Enter two strings:");
        Scanner sc=new Scanner(System.in);
        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        
        StringBuffer str3 = new StringBuffer(str1);

        System.out.println(str1.compareTo(str2));
        System.out.println(str3.insert(5, "Java"));
        System.out.println(str3.reverse());

        sc.close();
    }
}
