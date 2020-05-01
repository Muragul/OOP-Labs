package Task4;

public class Bishop extends Piece{
	
	public Bishop(int x, int y, String name, String color) {
		super(x, y, name, color);
		this.name = "Bishop";
	}
	public Bishop(Position a, String name, String color) {
		super(a, name, color);
		this.name = "Bishop";
	}
	public Bishop(String name) {
		super(name);
	}
	public Bishop() {
		super();
	}
	
	public boolean isLegalMove(Position a, Position b) {
		if (Math.abs(a.x-b.x) == Math.abs(a.y-b.y))return true;
		return false;
	}

}
