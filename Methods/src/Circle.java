import java.util.Scanner;

public class Circle {
	
	public static void main(String[] args) {
		System.out.println("Insert the Radius of the cricle:");
		Scanner scan = new Scanner(System.in);
		double rad = scan.nextDouble();
		
		double diameter = diameter(rad);
		double circumference = circumference(diameter);
		double area = area(circumference);
	
		System.out.println("The diameter of the circle is: " + diameter);
		System.out.println("The circumference of the circle is: " + circumference);
		System.out.println("The Area of the circle is: " + area);
	}
	
	public static double diameter(double rad) {
		double diam;
		diam = rad * 2;
		return diam;
	}
	
	public static double circumference(double diam) {
		double circ;
		circ = 3.1416 * diam;
		return circ;
	}
	
	public static double area(double circ) {
		double area;
		area = (circ * circ) / (4 * 3.1416);
		return area;
	}
	
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
}
