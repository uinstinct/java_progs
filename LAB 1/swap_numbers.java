import java.util.*;

class Swapper{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");

		int a = sc.nextInt();
		int b = sc.nextInt();

		a = a+b;
		b = a-b;

		a = a-b;

		System.out.println("Swapped a is "+ a + " and b is "+b);
		sc.close();
	}
}