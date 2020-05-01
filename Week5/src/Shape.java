
public abstract class Shape {
	public String color;
	public static int cnt;
	public int x;
	
	public abstract void draw();
	
	public void draw(int n) {
		for (int i=0;i<n;i++)
			draw();
	}

}
