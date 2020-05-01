package Task2;

public class Cylinder extends Shapes{
	public int r;
	public int h;
	
	public Cylinder (String color, int r, int h) {
		this.color = color;
		this.r = r;
		this.h = h;
	}
	public double volume() {
		this.volume = r*r*h*Math.PI;
		return this.volume;
	}
	public double surfaceArea() {
		this.surfaceArea = 2*r*h*Math.PI;
		return this.surfaceArea;
	}

}
