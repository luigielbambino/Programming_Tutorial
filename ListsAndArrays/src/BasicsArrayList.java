import java.util.*;

public class BasicsArrayList {
//beginner
	
	//todo: write some methods for basic operations with ArrayLists:
	//-write a method where you can add a certain value to an ArrayList
	//-write a method which prints all the values in an ArrayList
	
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(
				Arrays.asList("eins","zwei","drei","vier","funf","sechs","sieben","acht","neun","zehn"));
		String value = "elf";
		
		arrayList = listAdd(arrayList, value);
		listPrint(arrayList);

	}
	
	public static ArrayList<String> listAdd(ArrayList<String> arrayList, String value) {
		arrayList.add(value);
		return arrayList;
	}
	
	public static void listPrint(ArrayList<String> arrayList) {
		System.out.println("The new array: " + arrayList);
	}

}