public class BinaryOperations {
	/*
	 * BONUS: Write two recursive methods. One for adding binary numbers and one for
	 * subtracting them.
	 * */
	
	/*public static void main(String[] args) {
		String bn1 = "10";
		String bn2 = "101011";
		String max;
		String min;
		int zeros;
		
		if(bn1.length() > bn2.length()) {
			zeros = bn1.length() - bn2.length();
			max = bn1;
			min = bn2;
			for(int i = 0; i < zeros; i++) {
				min = "0" + min;
			}
		} else {
			zeros = bn2.length() - bn1.length();
			max = bn2;
			min = bn1;
			for(int i = 0; i < zeros; i++) {
				min = "0" + min;
			}
		}
		System.out.println(zeros + " min number: " + min );
		System.out.println("The sum of " + bn1 + " and " + bn2 + " is: " + add(max, min));
	}
	
	/*public static String add(String max, String min) {
		String sum;
		String tmax;
		String tmin;
		
		if (max == "0" && min == "0" || max == null || min == null) {
	        return "";
		} else if (max.length() == 0){
			tmax = max.substring(0,1);
			tmin = min.substring(0,1);
			add(max.substring(1), min.substring(1));
			if(max == "0" && min == "0") {
				sum = "0" + sum; 
			} else if(max == "1" && min == "0") {
				sum = "1" + sum;
			} else if(max == "1" && min == "1") {
				sum = "1" + sum;
			}
		}
		
		return sum;

	}
	
	public static String substract() {
		
	}*/
	
}