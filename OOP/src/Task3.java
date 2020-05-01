import java.util.Scanner;
public class Task3 {
	public static void main (String args[]) {
		Scanner input = new Scanner (System.in);
		int grade = input.nextInt();
		String mark;
		if (grade<=100) {
			if (grade>=95) {mark="A";} else
				if (grade>=90) {mark="A-";} else
					if (grade>=85) {mark="B+";} else
						if (grade>=80) {mark="B";} else
							if (grade>=75) {mark="B-";} else
								if (grade>=70) {mark="C+";} else
									if (grade>=65) {mark="C";} else
										if (grade>=60) {mark="C-";} else
											if (grade>=55) {mark="D+";} else
												if (grade>=50) {mark="D";} else
														mark="F";
		} else {
			mark="Not allowed";
		}
		System.out.print(mark);
		}

}
