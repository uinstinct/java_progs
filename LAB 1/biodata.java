import java.util.*;

class Biodata{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name, branch and roll");

		String name = sc.nextLine();
		String branch = sc.nextLine();
        String roll = sc.nextLine();

        System.out.println("you biodata is as follows:\n Name "+name+"\n Branch"+ branch+"\n Roll "+roll);
        
		sc.close();
	}
}