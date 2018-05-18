import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String rem = " ";
		
		
		if(0 < b && b < 10) {
			int mod = a % b;
			switch(mod) {
			case 0: rem = "zero";
			break;
			case 1: rem = "one";
				break;
			case 2: rem = "two";
				break;
			case 3: rem = "three";
				break;
			case 4: rem = "four";
				break;
			case 5: rem = "five";
				break;
			case 6: rem = "six";
				break;
			case 7:rem = "seven";
				break;
			case 8: rem = "eight";
				break;
			case 9: rem = "nine";
				break;
			default:
			}
			System.out.println("The result of the operation is " + rem);
		} else {
			System.out.println("The values are incorrect");
		}
			
		
		
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */

	}

}
