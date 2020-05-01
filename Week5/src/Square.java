
public class Square extends Shape{
	
	public Square(String color, int x) {
		this.color = color;
		this.x = x;
		cnt++;
	}
	
	public void space() {
		for (int i = 1;i < x; i++) System.out.print("	");
	}
	public void draw() {
		space();
		if (color.equals("red")) System.out.println("[RED]");
		else System.out.println("[]");
	}
}
