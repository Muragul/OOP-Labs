import java.util.Scanner;
public class Task1 {
public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
	    String name = input.next();
	    int l = name.length();
	    System.out.print('+');
	    for (int i=0;i<l;i++){
	    System.out.print('-');}
	    System.out.println('+');
	    System.out.print('|');
	    System.out.print(name);
	    System.out.println('|');
	    System.out.print('+');
	    for (int i=0;i<l;i++){
	    System.out.print('-');}
	    System.out.print('+');}
}