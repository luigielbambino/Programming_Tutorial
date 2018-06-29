
public class Driver {
	
	public static void main(String[] args) {
		//todo: create at least 1 student, 1 professor and one lecture
		// add the lecture to the student and the professor
		Professor p1 = new Professor("Hub", "Phd.");
		Student s1 = new Student("Git", 119308);
		Lecture lecture = new Lecture("Introduction to Java");
		
		p1.addLecture(lecture);
		s1.addLecture(lecture);
		
		System.out.println("Professor: " + p1.getName() + ", " + p1.getChair());
		System.out.println("Student: " + s1.getName() + ", " + s1.getmatrNr());
		
		p1.printLectures();
	}
	
}