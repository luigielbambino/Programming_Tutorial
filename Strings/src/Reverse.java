import java.util.Scanner;

//intermediate
//todo: take an String as input and reverse it. Then print it.

public class Reverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.next();
		
		System.out.println(stringReverse(inputString));
	}
	
	public static String stringReverse(String inputString) {
		String newString = "";
		for(int i = 0; i < inputString.length(); i++) {
			newString =  inputString.charAt(i) + newString;
		}
		return newString;
	}

}
