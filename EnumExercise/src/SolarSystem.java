
public enum SolarSystem {
	MERCURY (3.303e+23, 2.4397e6),
	VENUS (4.869e+24, 6.0518e6),
	EARTH (5.976e+24, 6.37814e6),
	MARS (6.421e+23, 3.3972e6),
	JUPITER (1.9e+27, 7.1492e7),
	SATURN (5.688e+26, 6.0268e7),
	URANUS (8.686e+25, 2.5559e7),
	NEPTUNE (1.024e+26, 2.4746e7);
	
	private final double mass;
	private final double radius;
	private final double GRAVITY = 6.67300E-11;
	
	private SolarSystem(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}
	
	public double getMass() {
		return mass;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getGravity() {
		return calculateG(mass, radius);
	}
	
	public double getWeight() {
		double weight = mass * calculateG(mass, radius);
		return weight;
	}
	
	private double calculateG(double mass, double radius) {
		double g = (GRAVITY*mass)/Math.sqrt(radius);
		return g;
	}

}