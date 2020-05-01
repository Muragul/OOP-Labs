import java.util.Scanner;
public class Task5 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		double interest, saved;
		saved = input.nextDouble();
		interest = 0.1;
		System.out.print("Old:");
		System.out.println(saved);
		saved += saved*interest;
		System.out.print("New:");
		System.out.println(saved);
	}

}
