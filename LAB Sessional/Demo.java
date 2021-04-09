import java.util.Scanner;

interface permutation {
    public double getPermutation();
}

interface combination {
    public double getCombination();
}

interface NPRnNCR extends permutation, combination {

}

class Demo implements NPRnNCR {
    static double num;
    double r;

    public Demo(double n, double tempr) {
        num = n;
        r = tempr;
    }

    public double getFactorial(double n) {
        double ans = 1;
        while (n > 1) {
            ans *= n;
            n--;
        }
        return ans;
    }

    public double getPermutation() {
        double x = getFactorial(num);
        double y = getFactorial(num - r);
        return (x / y);
    }

    public double getCombination() {
        double x = getFactorial(num);
        double y = getFactorial(r);
        double z = getFactorial(num - r);
        return x / (y * z);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter n and r");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        Demo dm = new Demo(x, y);

        System.out.println("permutation = " + dm.getPermutation() + " combination = " + dm.getCombination());
        sc.close();
    }
}