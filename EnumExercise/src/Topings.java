
public enum Topings {
	CREAM(0.30),
	LIQUIDCHOCOLATE(0.50);
	
	private final double price;
	
	private Topings(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
}