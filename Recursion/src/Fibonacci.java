import java.util.Scanner;

public class Fibonacci {
	//todo: implement a recursive function which takes an integer value as inputs and outputs the corresponding Fibonacci number.
	//if you don't know what Fibonacci numbers are you can read it here: https://en.wikipedia.org/wiki/Fibonacci_number
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int fibonacci;
		
		fibonacci = fibonacci(number);
		System.out.println("The fibonacci number of " + number + " is: " + fibonacci);
	}
	
	public static int fibonacci(int n) {
		int fn1;
		int fn2;
		int fnTotal;
		if(n == 1) {
			return 1;
		} else if(n <= 0){
			return 0;
		} else {
			fn1 = fibonacci(n-1);
			fn2 = fibonacci(n-2);
			fnTotal = fn1 + fn2;
		}
		return fnTotal;
	}

}