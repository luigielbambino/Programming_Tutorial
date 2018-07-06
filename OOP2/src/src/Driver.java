package src;

import java.util.Date;

public class Driver {
	
	public static void main(String args[]) {
		Lion myLion = new Lion("Tony", new Date(2001-9-12), true);
		Pig myPig = new Pig();
		
		System.out.println(myLion.getName() + " says: My birthday is on " + myLion.getBirthday() + " and I am " + myLion.getGender());
		myLion.saySomething();
		myLion.warningPlate();
		
		System.out.println(myPig.getName() + " says: My birthday is on " + myLion.getBirthday() + " and I am " + myLion.getGender());
		myPig.saySomething();
		myPig.pet();
		if(myPig.isDangerous){
			System.out.println("This animal is very nice :)");
		}
	}
	
	
}
