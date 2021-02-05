import java.util.*;

class Digits3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 digit number");

		int n = sc.nextInt();

		int a = n%10;
		n /= 10;
		int b = n%10;
		n /= 10;
		int c = n%10;

		System.out.println("The digits are "+c+","+b+","+a);
		sc.close();
	}
}