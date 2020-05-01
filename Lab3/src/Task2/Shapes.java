package Task2;

public abstract class Shapes {
	public String color;
	public double volume;
	public double surfaceArea;
	
	public abstract double volume();
	
	public abstract double surfaceArea();
	
	public boolean isHollow() {
		return volume==0;
	}

}
