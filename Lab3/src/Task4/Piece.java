package Task4;

public abstract class Piece {
	public Position a;
	public String name;
	public colour color;
	public enum colour{
		black,
		white
	};
	
	public Piece() {
		this.color = colour.black;
	}
	
	public Piece(String name) {
		this.name = name;
	}
	
	public Piece(int x, int y, String name, String color) {
		this.name = name;
		this.a.x = x;
		this.a.y = y;
		if (color == "black")this.color = colour.black; else
			this.color = colour.white;
	}
	public Piece(Position a, String name, String color) {
		this.a = a;
		this.name = name;
		if (color == "black")this.color = colour.black; else
			this.color = colour.white;
	}
	public abstract boolean isLegalMove(Position a, Position b);

}
