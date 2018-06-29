package src;

import java.util.Date;

abstract class Animal{
	protected String name;
	protected Date birthday;
	protected boolean isFemale;
	
	public Animal() {
		this.name = "N/A";
		this.birthday = new Date(2001-01-01);
		this.isFemale = true;
	}
		
	public abstract void saySomething();

}