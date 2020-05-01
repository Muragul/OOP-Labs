package Task2;

public class Sphere extends Shapes{
	public int r;
	
	public Sphere(String color,int r) {
		this.color = color;
		this.r = r;
	}
	public double volume() {
		this.volume = (4*r*r*r*Math.PI)/3;
		return this.volume;
	}
	public double surfaceArea() {
		this.surfaceArea = 4*r*r*Math.PI;
		return this.surfaceArea;
	}
}
