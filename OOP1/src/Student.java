import java.util.ArrayList;


public class Student {
	private String name;
	private int matrNr;
	private ArrayList lectures = new ArrayList();
	
	//todo: write a constructur that already gives the student a name and a matriculation number
	public Student(String name, int matrNr) {
		this.name = name;
		this.matrNr = matrNr;
	}
	public Student(String name) {
		this.name = name;
		this.matrNr = 0;
	}
	public Student() {
		this.name = "Unknown";
		this.matrNr = 0;
	}
	
	//todo: write getter and setter methods
	
	public void addLecture(Lecture lecture){
		//todo: fill this method
		this.lectures.add(lecture);
	}
	
	public ArrayList getLecture() {
		return lectures;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public int getmatrNr() {
		return matrNr;
	}
	
	public void setmatrNr() {
		this.matrNr = matrNr;
	}
}
