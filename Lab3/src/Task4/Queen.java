package Task4;

public class Queen extends Piece {

	public Queen(int x, int y, String name, String color) {
		super(x, y, name, color);
		this.name = "Queen";
	}
	public Queen(Position a, String name, String color) {
		super(a, name, color);
		this.name = "Queen";
	}
	public Queen(String name) {
		super(name);
	}
	public Queen() {
		super();
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (a.x == b.x || a.y == b.y)return true;
		if (Math.abs(a.x-b.x) == Math.abs(a.y-b.y))return true;
		return false;
	}
	
}
