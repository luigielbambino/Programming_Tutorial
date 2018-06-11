import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = scan.next();
		scan.close();
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee
		
		System.out.println("The extended string is: " + computeString(inputString));
	}
	
	public static String computeString(String inputString) {
		StringBuilder sb = new StringBuilder();
		int repNumber = 1;
		String nextInt = "0";
		boolean isNumber = false;
		int starStr = 0;
		int endStr = 1;
		
		for(int i = 0; i < inputString.length(); i++) {
			
			isNumber = detectNumber(Character.toString(inputString.charAt(i)));
			
			if(isNumber == true) {
				//nextInt = Character.toString(inputString.charAt(i));
			} else {
				if(i != 0) { endStr = i; }
				nextInt = inputString.substring(starStr, endStr);
				
				isNumber = detectNumber(nextInt);
				
				if(isNumber == true) { repNumber = Integer.parseInt(nextInt); }
				else {repNumber = 1;}
				
				for(int j = 0; j < repNumber; j++) {
					sb.append(inputString.charAt(i));
				}
				
				nextInt = "1";
				starStr = i+1;
			}
			
		}
		
		String newString = sb.toString();
		
		return newString;
		}
	
	
	public static boolean detectNumber(String s) {
		boolean isNumber = false;
		try {
			Integer.parseInt(s);
			isNumber = true;
		}
		catch(Exception e){
			//string is not a number
			isNumber = false;
		}
		
		return isNumber;
		}
	
}