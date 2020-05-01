import java.util.Scanner;
public class Task4 {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		double d = (b*b) - (4*a*c);
		double x1, x2;
		if (d>0) {
			x1 = (b*(-1)+Math.sqrt(d))/(2*a);
			x2 = (b*(-1)-Math.sqrt(d))/(2*a);
			System.out.println(x1);
			System.out.print(x2);
		} else {
			if (d==0) {
				x1=(-1*b)/(2*a);
				System.out.print(x1);
			} else {
				System.out.print("No roots");
			}
		}
	}

}
