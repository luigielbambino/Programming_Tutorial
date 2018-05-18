import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = a + b + c;
		int mean = (a + b + c)/3;
		int maxV = 0;
		int minV = 0;

		
		if(a > c && a > b) {
			maxV = a;
		} else if(b > a && b > c) {
			maxV = b;
		} else if(c > a && c > b) {
			maxV = c;
		} 
		
		if(a < c && a < b) {
			minV = a;
		} else if(b < a && b < c) {
			minV = b;
		} else if(c < a && c < b) {
			minV = c;
		}
		
		System.out.println("The values are: " + a + ", " + b + ", " + c);
		System.out.println("The sum of the values is: " + sum);
		System.out.println("The mean of the values is: " + mean);
		System.out.println("The maximun value is: " + maxV);
		System.out.println("The minimum value is: " + minV);
		
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

}
