import java.util.Scanner;

public class GCDTester {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int input = -1;
		while(input != 0)
		{
			System.out.println("Please enter a number");
			int num1 = sc.nextInt();
			System.out.println("Please enter another number");
			int num2 = sc.nextInt();
			int gcd = GCD.findGCD(num1, num2);
			System.out.println("GCD:" + gcd);
			System.out.println("Would you like to try again?  Type 1 for yes or 0 or no.");
			input = sc.nextInt();
		}
	}

}
