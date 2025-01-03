package entities;

public class Circle implements Shape { // implementando a interface Shape
	
	private Double radius;
	
	public Circle (double radius) {
		super();
		this.radius = radius;
	}
	
	// Get 
	
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
