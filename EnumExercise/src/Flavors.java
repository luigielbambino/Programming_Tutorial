
public enum Flavors {
	VANILLA(1),
	CHOCOLATE(2),
	STRAWBERRY(3),
	LEMON(4),
	BANANA(5);
	
	private final int id;
	
	private Flavors(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}
