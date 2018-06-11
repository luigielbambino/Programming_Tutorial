import java.util.Scanner;

//beginner

//todo: Read integer values as input and add them until the user writes a 'stop'.
//Print the result.

public class Addition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int nbrBuffer = 0;
		
		if(!"stop".equals(input)){
			while(!"stop".equals(input)) {
				try {
					nbrBuffer = nbrBuffer + Integer.parseInt(input);
			      }
				catch(Exception e){
					System.out.println("The input element is not a number");
				}
				
				input = scan.nextLine();
			}
			scan.close();
		}
		
		System.out.println(nbrBuffer);
		
	}
	
}