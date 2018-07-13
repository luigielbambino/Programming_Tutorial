
public class Pair <A, B> {
	//todo: In Java it is not possible to have two return values. Luckily you can use Generics to solve that problem.
	//Change this class to a Generic where you can have a pair of two Variables even with different data types.
	//Write a constructor for this class to set those values and also getter and setter methods to retrieve them and
	//test your Methods in a driver-class
	private A a;
	private B b;
	
	public Pair(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public A getA() {
		return a;
	}
	public void setA() {
		this.a = a;
	}
	
	public B getB() {
		return b;
	}
	public void setB() {
		this.b = b;
	}
		
}
