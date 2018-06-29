
public class ExceptionHandling {

	
	public static void main(String[] args) {
		
		//todo:
		//1.) Execute the following program. It will throw Exceptions.
		//Catch the Exceptions using their proper Names till no further
		//exceptions occur.
		//
		//2.) Taking the square root of a negative number won't cause
		//the exception. Write your own Exception for this case and 
		//write a method which throws this exception

		int a = 5;
		int b = 0;
		
		try {
			int div = a/b;
		}catch(ArithmeticException e) {
			System.err.println("An Arithmetic Exception ocurred");
			//e.printStackTrace();
		}
		
		
		int[] arr = new int[5];
		try {
			arr[5] = 7;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("The index of the array is grater that the its size");
			//e.printStackTrace();
		}
		
		String one = "one";
		try {
			int i = Integer.parseInt(one);
		}catch(NumberFormatException e) {
			System.err.println("Words cannot be converted into numbers");
			//e.printStackTrace();
		}
		
		double c = -7.0;
		double d;
		try {
			d = sqrtException(c);
		}catch(Exception e) {
			System.err.println("Impossible to perform the square root of a negative number");
			e.printStackTrace();
			d = 0;
		}
		
		System.out.println(d);
	}
	
	public static double sqrtException(double c) throws CustomException{
		if(c < 0) {
			throw new CustomException("Cannot do Sqrt < 0 ");
		}
		double d = Math.sqrt(c);
		return d;
	}
	
}