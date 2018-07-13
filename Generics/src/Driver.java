
public class Driver {

	public static void main(String args[]) {
		
		Pair<Integer, String> firstPair = returnPair(10, "ten");
		
		System.out.println("Integer value is: " + firstPair.getA() + " and String value is: " + firstPair.getB());
		
	}
	
	public static Pair<Integer, String> returnPair(Integer number, String word) {
		Pair<Integer, String> firstPair = new Pair<Integer, String>(number, word);
		return firstPair;
	}
}