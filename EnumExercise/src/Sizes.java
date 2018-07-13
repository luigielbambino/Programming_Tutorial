
public enum Sizes {
	NORMAL(0.50),
	MEDIUM(1.00),
	LARGE(1.50);
	
	private final double price;
	
	private Sizes(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	

}
