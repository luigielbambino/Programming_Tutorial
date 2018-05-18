import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(primeNumber(number));
		//todo: write a method which tells you if a given number is a prime or not
	}
	
	public static String primeNumber(int number) {
		String judge = "";
		if(number == 0 || number == 1) {
			judge = number + " is not a prime number";
		} else {
			for(int i = 2; i <= number; i++) {
				if(number%i == 0 && number != i) {
					judge = number + " is not a prime number";
					i = number + 1;
				}
				if(number%i == 0 && number == i) {
					judge = number + " is a prime number";
				}
			}
		}
		return judge;
	}
	
}