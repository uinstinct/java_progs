import java.util.*;

class CompI{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of p, t and r and n");

		double p = sc.nextDouble();
		double t = sc.nextDouble();
		double r = sc.nextDouble();
		double n = sc.nextDouble();

		double amount = p * Math.pow(1+(r/n),n)*t;

		System.out.println("The compound interest is " +(amount-p));
		sc.close();
	}
}