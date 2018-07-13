import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iceCreamShop {
 /*Ice cream - enums excercise
	1. write enum for ice flavor, possible flavors: vanilla, chocolate, strawberry, lemon and banana.
	2. icheshop sells three sizes scoop, nomrmal, medium and large. write enum.
	3. Set price for scoops with a constructor	
	4. write a class iceScoope with a constructor. takes the size and flavor as input	
	5. Costumer can choose if take ice in a cup or cone	
	6. Different topings: cream, liquid chocolate 
	7. keep in mind that topics have a price
	
	8. When customer order icecreams, sets the number of scoop , how is served and topic. Write a class icecream, should have a constructor which receives all the information for ordering
	9. Create a class iceshop. Should have methods that return array with all possible flavors. Ordering icecream and receive ice in one class
	10. Print the cost of the icecream.
 */
	
	public static void main(String args[]) {
		printFlavors();
		printSizes();
		Container container = Container.CONE;
		Topings toping = Topings.CREAM;
		
		iceScoop iceScoop1 = new iceScoop(Flavors.VANILLA, Sizes.MEDIUM);
		iceScoop iceScoop2 = new iceScoop(Flavors.STRAWBERRY, Sizes.LARGE);
		iceScoop iceScoop3 = new iceScoop(Flavors.CHOCOLATE, Sizes.MEDIUM);
		
		ArrayList<String> scoopList = new ArrayList<String>();
		addScoops(scoopList, iceScoop1);
		addScoops(scoopList, iceScoop2);
		addScoops(scoopList, iceScoop3);
		
		IceCream iceCream = new IceCream(scoopList, container, toping);
				
		getOrder(iceCream);

	}

	public static void printFlavors() {
		System.out.println("Falvors:");
		for(Flavors flavor: Flavors.values()) {
			System.out.println(flavor.getId() + ". " + flavor);
		}
	}
	public static void printSizes() {
		System.out.println("Scoop sizes:");
		for(Sizes size: Sizes.values()) {
			System.out.println("Sizes: " + size);
		}
	}
	public static ArrayList<String> addScoops(ArrayList<String> scoopList, iceScoop scoop){
		String size = scoop.getSize().toString();
		String flavor = scoop.getFlavor().toString();
		scoopList.add(size);
		scoopList.add(flavor);
		return scoopList;
	}
	public static void getOrder(IceCream iceCream) {
		double total = 0;
		String allScoops = "";
		ArrayList<String> scoop = iceCream.getScoopList();
		//System.out.println("scoop size: " +scoop.size());
		for(int i = 0; i < scoop.size(); i++) {
			if((i % 2) != 0){
				allScoops = allScoops + " " + scoop.get(i);
			} else {
				if(i == 0) {
					allScoops = scoop.get(i);
				}else {
					allScoops = allScoops + ", " + scoop.get(i);
				}
				
				switch(scoop.get(i)) {
					case "LARGE":
						total = total + Sizes.LARGE.getPrice();
						//System.out.println("price " + scoop.get(i) + ": " + Sizes.LARGE.getPrice());
						break;
					case "MEDIUM":
						total = total + Sizes.MEDIUM.getPrice();
						//System.out.println("price " + scoop.get(i) + ": " + Sizes.MEDIUM.getPrice());
						break;
					case "NORMAL":
						total = total + Sizes.NORMAL.getPrice();
						//System.out.println("price " + scoop.get(i) + ": " + Sizes.NORMAL.getPrice());
						break;
				}
				
			}
			
		}
	
		String toping = iceCream.getToping().toString();
		total = total + iceCream.getToping().getPrice();
		
		String container = iceCream.getContainer().toString();
		
		System.out.println("Here is your order: " + allScoops + " - with " + toping + " on a " + container);
		System.out.println("Total: " + total);
		
	}
	
}

