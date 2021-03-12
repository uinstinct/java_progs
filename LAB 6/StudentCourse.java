/* LAB 8. 1. Illustrate the usage of abstract class with following Java classes –
i>An abstract class „student‟ with data member roll no, reg no and a
abstract method course()
ii>A subclass „kiitian‟ with course() method implementation */

import java.util.*;

abstract class student {
    int roll;
    int reg;

    abstract void course(int rl, int rg);
}

class kiitian extends student {
    void course(int rl, int rg) {
        if (rl > 1905000 && rl < 190600) {
            System.out.println("CSE");
        } else {
            System.out.println("Not CSE");
        }
    }
}

public class StudentCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll and reg");

        int rl = sc.nextInt();
        int rg = sc.nextInt();

        kiitian k = new kiitian();
        k.course(rl, rg);
        sc.close();
    }
}
