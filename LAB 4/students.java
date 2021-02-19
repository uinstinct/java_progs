import java.util.Scanner;

class Individual {
    int roll;
    String name;
    int cgpa;
}

public class students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students");
        int n = sc.nextInt();

        Individual st[] = new Individual[n];

        int pos = 0, minCGPA = 10;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of " + i + " student");
            st[i].roll = sc.nextInt();
            st[i].name = sc.nextLine();
            st[i].cgpa = sc.nextInt();

            if (minCGPA > st[i].cgpa) {
                minCGPA = st[i].cgpa;
                pos = i;
            }
        }

        System.out.println("the lowest cgpa details are" + st[pos].name + " " + st[pos].roll + " " + st[pos].cgpa);

        sc.close();
    }
}
