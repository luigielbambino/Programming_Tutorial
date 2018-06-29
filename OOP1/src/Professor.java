import java.util.ArrayList;


public class Professor {
	private String name;
	private String chair;
	private ArrayList lectures = new ArrayList();
	
	//todo: write a constructur that already gives the professor a name and a chair
	public Professor(String name, String chair){
		this.name = name;
		this.chair = chair;
	}
	public Professor(String name){
		this.name = name;
		this.chair = "N/A";
	}
	public Professor(){
		this.name = "Unknown";
		this.chair = "N/A";
	}
	
	//todo: write getter and setter methods
	
	public void addLecture(Lecture lecture){
		//todo: fill this method
		this.lectures.add(lecture);
	}
	
	public ArrayList getLectures() {
		return lectures;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public String getChair() {
		return chair;
	}
	
	public void setChair() {
		this.chair = chair;
	}
	
	public void printLectures() {
		//lectures.get(0);
		/*
		 * AlgoDat
		 * ProgTut
		 * 
		 * lectures.get(i).getName();
		 * 
		 * for(Lecture l : lectures){
		 * 		l.getName();
		 * }
		 * 
		 * ==
		 * 
		 * for(int i = 0; i < lectures.siye(); ++i) {
		 * 		lecture l = lectures.get(i);
		 * }
		 * */
	}

}