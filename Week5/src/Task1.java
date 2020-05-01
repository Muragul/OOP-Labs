import java.util.*;

public class Task1 {
	public static void main(String args[]) {
		HashSet <Shape> shapes1 = new HashSet <Shape>();
		shapes1.add(new Circle("black", 4, 1));
		shapes1.add(new Circle("red", 2, 2));
		shapes1.add(new Circle("black", 0, 3));
		shapes1.add(new Circle("black", 0, 4));
		shapes1.add(new Circle("red", 4, 5));
		shapes1.add(new Circle("black", 2, 6));
		for (Shape s:shapes1) {
			//if (s instanceof Circle)
			//	System.out.print(((Circle) s).getRadius());
			s.draw();
		}
	}
}
