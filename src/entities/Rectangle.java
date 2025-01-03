package entities;

public class Rectangle implements Shape {
	private Double width;
	private Double height;
	
	// Construtore
	public Rectangle() {
		super();
	}
	public Rectangle(Double width, Double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	
	// Método operado
	
	@Override
	public double area() {
		return width * height;
	}
	
}
