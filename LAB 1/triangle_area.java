import java.util.*;

class TriangleArea{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers");

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double semiPermiter = (a+b+c)/3.0;
		
		double area = Math.sqrt((semiPermiter)*(semiPermiter-a)*(semiPermiter-b)*(semiPermiter-c));

		System.out.println("The area is "+area);
		sc.close();
	}
}