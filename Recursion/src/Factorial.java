import java.util.Scanner;

public class Factorial {
	//todo: implement a recursive functions which gives you the factorial value of a given number
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int factorial = factorial(number);
		System.out.println("The factorial of " + number + " is: " + factorial );
	}
	
	public static int factorial(int number) {
		int factorSum;
		if(number <= 1) {
			return 1;
		} else {
			factorSum = number * factorial(number-1);
		}
		return factorSum;
	}

	
}