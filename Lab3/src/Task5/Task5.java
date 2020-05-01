package Task5;
import java.util.*;

public class Task5 {
	public static void main(String args[]) {
		Vector <Person> users = new Vector<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Add user(1), show users(2), exit(3)");
		int input = scanner.nextInt();
		while (input!=3) {
			if (input == 2) {
				for (Person p: users)
					System.out.println(p.toString());
			} else {
				if (input == 1) {
					System.out.println("Add Person(1), Student(2) or Staff(3)?");
					int s = scanner.nextInt();
					if (s==1) {
						System.out.print("[Name]");
						String s1 = scanner.next();
						System.out.print("[Address]");
						String s2 = scanner.next();
						users.add(new Person(s1,s2));
					} else
					if (s==2) {
						System.out.print("[Name]");
						String s1 = scanner.next();
						System.out.print("[Address]");
						String s2 = scanner.next();
						System.out.print("[Program]");
						String s3 = scanner.next();
						System.out.print("[Year of study]");
						int i = scanner.nextInt();
						System.out.print("[Fee]");
						double d = scanner.nextDouble();
						users.add(new Student(s1,s2,s3,i,d));
					} else
					if (s==3) {
						System.out.print("[Name]");
						String s1 = scanner.next();
						System.out.print("[Address]");
						String s2 = scanner.next();
						System.out.print("[School]");
						String s3 = scanner.next();
						System.out.print("[Pay]");
						double d = scanner.nextDouble();
						users.add(new Staff(s1,s2,s3,d));
					}
				}
			}
			System.out.println("Add user(1), show users(2), exit(3)");
			input = scanner.nextInt();
		}
	}

}
