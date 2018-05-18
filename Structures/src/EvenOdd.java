import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for(int i=1; i < number; i++ ) {
			if((i % 2) != 0) {
				System.out.println(i + " is odd");
			}
		}
		System.out.println(number + " is the last number");
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
