package Task4;

public class Board {
	public static void main(String Args[]) {
		King King = new King("King");
		Position a = new Position(2,2);
		Position b = new Position(1,3);
		System.out.println("For King");
		System.out.println(King.isLegalMove(a, b));
		
		Queen Queen = new Queen();
		Position c = new Position(3,2);
		Position d = new Position(1,3);
		System.out.println("For Queen");
		System.out.println(Queen.isLegalMove(a, b));
		System.out.println(Queen.isLegalMove(c, d));
		
		Rook Rook = new Rook();
		Position e = new Position(3,2);
		Position f = new Position(3,1);
		System.out.println("For Rook");
		System.out.println(Rook.isLegalMove(a, b));
		System.out.println(Rook.isLegalMove(e, f));
		
		Bishop Bishop = new Bishop();
		System.out.println("For Bishop");
		System.out.println(Bishop.isLegalMove(a, b));
		System.out.println(Bishop.isLegalMove(c, d));
		
		Knight Knight = new Knight();
		Position k = new Position(1,4);
		System.out.println("For Knight");
		System.out.println(Knight.isLegalMove(a, k));
		System.out.println(Knight.isLegalMove(a, b));
		
		Pawn Pawn = new Pawn();
		System.out.println("For Pawn");
		System.out.println(Pawn.isLegalMove(a, b));
		System.out.println(Pawn.isLegalMove(f, e));
	}
}
