package src;

import java.util.Date;

public class Lion extends Animal implements Predator{
	
	public Lion(String name, Date date, boolean isFemale) {
		super.name = name;
		super.birthday = birthday;
		super.isFemale = isFemale;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBirthday() {
		return birthday.toString();
	}
	
	public String getGender(){
		return (super.isFemale) ? "female" : "male";
	}
	
	public void saySomething() {
		System.out.println("Grrrr!");
	}
	
	public void warningPlate() {
		System.out.println("Be careful, wild " + super.name + " in the surroundings");
	}
}