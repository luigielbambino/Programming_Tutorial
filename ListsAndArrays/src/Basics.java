public class Basics {
//beginner
	
	//todo: write some methods for some basic operations with arrays, like:
	//-return the length of an array
	//-drop the last element of an array
	//-sum up all the elements of an integer array
	//-check if an array contains a given element
	
public static void main(String[] args){
	int[] arraytInt = {0,1,2,3,4,5,6,7,8,9,10};
	String[] arrayStr = {"eins", "zwei", "drei", "vier", "funf"};
	String word = "drei";
	
	System.out.println("The lenght of the given arrays is: " + arrayLenght(arraytInt));
	
	arrayStr = arrayDrop(arrayStr);
	System.out.println("The last element of the array has been removed. Remaining elements are: ");
	for(int i=0; i < arrayStr.length; i++ ) {
		System.out.println("element: " + arrayStr[i]);
	}
	
	System.out.println("The sum of the integer array is: " + arraySum(arraytInt));
	
	System.out.println(arraySearch(arrayStr, word) +  " " + word +  " found in the array");
}
	
public static int arrayLenght(int[] arraytInt){
	int lenght = arraytInt.length;
	return lenght;
	
}

public static String[] arrayDrop(String[] arrayStr){
	int index = arrayStr.length;
	String[] newArray = new String[index-1];
	for(int i=0; i < (index-1); i++) {
		newArray[i]= arrayStr[i];
	}
	return newArray;
}

public static int arraySum(int[] arraytInt){
	int sum = 0; 
	for(int i = 0; i < arraytInt.length; i++) {
		sum = sum + arraytInt[i];
	}
	return sum;
}

public static int arraySearch(String[] arrayStr, String keyword){
	int counter = 0;
	for(int i = 0; i < arrayStr.length; i++){
		if(arrayStr[i] == keyword) {
			counter++;
		}
	}
	return counter;
}

}
