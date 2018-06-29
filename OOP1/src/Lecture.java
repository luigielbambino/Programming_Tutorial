
public class Lecture {
	private String name;
	private double credits;
	
	//todo: write a constructor which already takes a name and credits
	public Lecture(String name, double credits) {
		this.name = name;
		this.credits = credits;
	}
	
	public Lecture(String name) {
		this.name = name;
		this.credits = 0.0;
	}
	
	public Lecture() {
		this.name = "Unknown";
		this.credits = 0.0;
	}
	
	//todo: write getter and setter methods
	
	public String getName(){
		return name;
	}
	public void setName() {
		this.name = name;
	}

	public double getCredits() {
		return credits;
	}
	
	public void setCredits() {
		this.credits = credits;
	}
	
}
