package src;

import java.util.Date;

public class Pig extends Animal implements Pet{
	
	public Pig() {
		super.name = "Pig";
		super.birthday = new Date(2001-01-01);
		super.isFemale = true;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDate() {
		return birthday.toString();
	}
	
	public String getGender() {
		return (super.isFemale) ? "Female" : "Male";
	}
	
	public void saySomething() {
		System.out.println("Oink Oink!");
	}
	
	public void pet() {
		System.out.println(super.name + " is a lovely pet");
	}
}