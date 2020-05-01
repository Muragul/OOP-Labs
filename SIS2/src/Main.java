import students.Student;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Course COURSE = new Course("Object-oriented Programming and Design",3);
		ArrayList <Student> STUDENTS = new ArrayList <>();
		STUDENTS.add(new Student ("Student A", 1));
		STUDENTS.add(new Student ("Student B", 2));
		STUDENTS.add(new Student ("Student C", 3));
		STUDENTS.add(new Student ("Student D", 4));
		STUDENTS.add(new Student ("Student E", 5));
		STUDENTS.add(new Student ("Student F", 6));
		STUDENTS.add(new Student ("Student G", 7));
		STUDENTS.add(new Student ("Student H", 8));
		STUDENTS.add(new Student ("Student I", 9));
		STUDENTS.add(new Student ("Student J", 10));
		GradeBook GRADEBOOK = new GradeBook(COURSE, STUDENTS);
		System.out.println(GRADEBOOK.displayMessage());
		for (int i=0;i<10;i++) {
			System.out.print(STUDENTS.get(i).toString());
			int input = scanner.nextInt();
			STUDENTS.get(i).setGrade(input);
		}
		System.out.print(GRADEBOOK.displayGradeReport());
	}
}
//решила вручную добавить список, но можно вводить с консоли, т к в коде нет
//определенного размера списка, там везде .size();