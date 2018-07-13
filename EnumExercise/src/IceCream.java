import java.util.ArrayList;

public class IceCream {
	private ArrayList<String> scoopList;
	private Container container;
	private Topings toping;
	
	public IceCream(ArrayList<String> scoopList, Container container, Topings toping) {
		this.scoopList = scoopList;
		this.container = container;
		this.toping = toping;
	}

	public ArrayList<String> getScoopList() {
		return scoopList;
	}
	public Container getContainer() {
		return container;
	}
	public Topings getToping() {
		return toping;
	}

}
