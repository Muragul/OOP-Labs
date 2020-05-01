package Task4;

public class Rook extends Piece{

	public Rook(int x, int y, String name, String color) {
		super(x, y, name, color);
		this.name = "Rook";
	}
	public Rook(Position a, String name, String color) {
		super(a, name, color);
		this.name = "Rook";
	}
	public Rook(String name) {
		super(name);
	}
	public Rook() {
		super();
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (a.x == b.x || a.y == b.y)return true;
		return false;
	}


}
