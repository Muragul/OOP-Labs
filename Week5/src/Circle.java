
public class Circle extends Shape {
	private int radius;
	
	public Circle(String color, int x, int radius) {
		this.color = color;
		this.x = x;
		this.radius = radius;
		cnt++;
	}
	
	public int getRadius() {
		return radius;
	}
	public void draw() {
		for (int i = 1;i < x; i++) System.out.print("	");
		if (color.equals("red")) System.out.println("(RED"+radius+")");
		else System.out.println("("+radius+")");
	}

}
