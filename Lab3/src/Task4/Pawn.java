package Task4;

public class Pawn extends Piece{
	
	public Pawn(int x, int y, String name, String color) {
		super(x, y, name, color);
		this.name = "Pawn";
	}
	public Pawn(Position a, String name, String color) {
		super(a, name, color);
		this.name = "Pawn";
	}
	public Pawn(String name) {
		super(name);
	}
	public Pawn() {
		super();
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (a.x == b.x && (a.y + 1 == b.y))return true;
		return false;
	}

}
