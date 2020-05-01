package Task4;

public class King extends Piece {
	
	public King(int x, int y, String name, String color) {
		super(x, y, name, color);
		this.name = "King";
	}
	public King(Position a, String name, String color) {
		super(a, name, color);
		this.name = "King";
	}
	public King(String name) {
		super(name);
	}
	public King() {
		super();
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (a.x==b.x && (b.y+1==a.y || b.y-1==a.y))return true;
		if (a.x-1==b.x && (b.y==a.y || b.y==a.y-1 || b.y==a.y+1))return true;
		if (a.x+1==b.x && (b.y==a.y || b.y==a.y-1 || b.y==a.y+1))return true;
		return false;
	}
}
