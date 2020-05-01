package Task2;

public class Cube extends Shapes{
	public int a;
	
	public Cube(String color, int a) {
		this.color = color;
		this.a = a;
	}	
	public double volume() {
		this.volume = a*a*a;
		return this.volume;
	}
	public double surfaceArea() {
		this.surfaceArea = 6*a*a;
		return this.surfaceArea;
	}

}
