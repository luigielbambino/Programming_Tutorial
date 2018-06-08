
public class AccountBook {
//intermediate (multidimensional arrays)
	
	//todo: a bank will give you 2% interest on your savings stored on an account book.
	//for a certain amount of money you want to store in the account book create a multidimensional array where
	//the interest of the next 10 years is stored.
	//For that save the year and the amount of money. Write a method which takes a certain year as input (e.g. 2019) and an amount of money you would like to store
	//and returns the saving you would have for this year.
	
	public static void main(String[] args){
		int currentYear = 2018;
		int targetYear = 2020;
		int initialSavings = 7800;
		
		double[][] accountBook = computeInterest(currentYear, initialSavings);
		
		
		System.out.println("In the year " + targetYear + " you would have saved " + accountBook[targetYear-currentYear-1][1]);
	}
	
	public static double[][] computeInterest(int currentYear, int initialSavings) {
		double[][] interestArray = new double[10][2];
		double anualInterest = 0.02;
		double bufferSavings = initialSavings;
		double bufferYear = currentYear;
		
		for(int i = 0; i < 10; i++) {
			bufferSavings = bufferSavings * (1+anualInterest);
			bufferYear = bufferYear + 1;
			interestArray[i][0] = bufferYear;
			interestArray[i][1] = bufferSavings;
			System.out.println(interestArray[i][0] + " - " + interestArray[i][1]);
		}
		
		return interestArray;
	}

}
