import java.util.Scanner;

class sub {
    int subtract(int x, int y) {
        return (x - y);
    }

    int subtract(int x, int y, int z) {
        return ((x - y) - z);
    }

    double subtract(double x, double y) {
        return (x - y);
    }

    public static void main(String args[]) {
        sub s = new sub();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("1 - " + s.subtract(a, b));
        System.out.println("2 - " + s.subtract(a, b, c));
        System.out.println("3 - " + s.subtract((double) a, (double) b));

        sc.close();
    }
}