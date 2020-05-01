import java.util.*;
import java.util.Scanner;
public class Analyzer {
	public static void main(String args[]) {
		Data data = new Data();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number (Q to quit): ");
		String s = scanner.next();
		while (!s.equalsIgnoreCase("Q")) {
			double value = Double.parseDouble(s);
			data.addValue(value);
			System.out.print("Enter number (Q to quit): ");
			s = scanner.next();
		}
		System.out.println("Average = " + data.getAverage());
		System.out.print("Maximum = "+ data.getLargest());
	}

}
//Все еще забываю, что строку сравнивают через equals, из-за этого долго
//не могла сделать
//Узнала как можно переводить строку в число