package Task4;

public class Knight extends Piece {
	
	public Knight(int x, int y, String name, String color) {
		super(x, y, name, color);
		this.name = "Knight";
	}
	public Knight(Position a, String name, String color) {
		super(a, name, color);
		this.name = "Knight";
	}
	public Knight(String name) {
		super(name);
	}
	public Knight() {
		super();
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if ((a.x == b.x + 2 || a.x == b.x - 2) && (a.y + 1 == b.y || a.y - 1 == b.y))
			return true; else
		if ((a.y == b.y + 2 || a.y == b.y - 2) && (a.x + 1 == b.x || a.x - 1 == b.x))
			return true;
		return false;
	}

}
