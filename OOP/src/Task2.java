import java.util.Scanner;
public class Task2 {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		double area = a*a;
		int p = a*4;
		double diagonal = Math.sqrt(area+area);
		System.out.print("area:");
		System.out.println(area);
		System.out.print("perimeter");
		System.out.println(p);
		System.out.print("length of diagonal");
		System.out.print(diagonal);
	}

}
