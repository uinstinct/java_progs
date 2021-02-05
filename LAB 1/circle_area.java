import java.util.*;

class CicleArea{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");

		int r = sc.nextInt();

		double area = Math.PI * r * r;

		System.out.println("The Area is "+area);
		sc.close();
	}
}