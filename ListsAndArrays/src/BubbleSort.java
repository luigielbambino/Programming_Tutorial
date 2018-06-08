
public class BubbleSort {
//intermediate
	
	//todo: sort an array using bubblesort.
	//if you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	public static void main(String[] args) {
		int[] bubbleArray = {21,12,873,2,8,12,89,21,54,19,63,99,103,26,11};
		
		bubbleArray = bubbleSort(bubbleArray);
		
		for(int i = 0; i<bubbleArray.length; i++) {
			System.out.println(bubbleArray[i]);
		}
		
	}
	
	public static int[] bubbleSort(int[] bubbleArray) {
		int buffer;
		for(int j = 1; j < bubbleArray.length; j++) {
			for(int i = 0; i < (bubbleArray.length-1); i++) {
				if(bubbleArray[i] > bubbleArray[i+1]) {
					buffer = bubbleArray[i+1];
					bubbleArray[i+1] = bubbleArray[i];
					bubbleArray[i] = buffer;
				}
			}
		}
		
		return bubbleArray;
	}
	
}
