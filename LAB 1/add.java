import java.util.*;

class Add{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;

		System.out.println("The sum is "+sum);
		sc.close();
	}
}