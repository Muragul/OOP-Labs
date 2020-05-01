package Task4;

public class Position {
	public int x;
	public int y;
	
	public Position (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String getPosition() {
		return x+" "+y;
	}
	public int getPositionX() {
		return x;
	}
	public int getPositionY() {
		return y;
	}
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
