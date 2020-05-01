package Task2;

import java.util.*;
import java.io.*;
import java.time.LocalDate;

public class Driver {
	public static void main(String Args[]) throws IOException, ClassNotFoundException {
		HashSet <Course> courses = new HashSet<>();
		HashSet <Textbook> textbooks = new HashSet<>();
		HashSet <Instructor> instructors = new HashSet<>();
		FileReader fr = new FileReader("admin.txt");
		BufferedReader br = new BufferedReader(fr);	
		String line = br.readLine();
		String [] note = line.split(" ");
		String adminLogin = note [1];
		line = br.readLine();
		note = line.split(" ");
		String adminPassword = note [1];
		br.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter("admin.txt", true));
		
		System.out.print("Choose mode: \n 1) admin \n 2) user");
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		if (s==1) {
			System.out.println("Username: ");
			String login = scanner.next();
			System.out.println("Password: ");
			String password = scanner.next();
			password = password.hashCode()+"";
			if (login.equals(adminLogin) && adminPassword.equals(password)){
				bw.write("\n"+LocalDate.now()+" "+"admin logged in to a system");
				System.out.println("Hi, admin! \n Choose action: \n 1) add course "
						+ "\n 2) add textbook \n 3) add Instructor");
				s = scanner.nextInt();
				if (s==1) {
					System.out.print("Write course data");
					String title = scanner.next();
					Course course = new Course(title);
					courses.add(course);
					bw.write("\n"+LocalDate.now()+" "+"admin added course "+course.getCourseTitle());
					System.out.println("OK");
				} else
				if (s==2) {
					System.out.print("Write textbook data: \n isbn:");
					s = scanner.nextInt();
					System.out.print("\n title:");
					String title = scanner.next();
					System.out.print("\n author:");
					String author = scanner.next();
					Textbook txt = new Textbook (s, title, author);
					textbooks.add(txt);
					bw.write("\n"+LocalDate.now()+" "+"admin added textbook "+txt.getTitle());
					System.out.println("OK");
				} else
				{
					System.out.print("Write Instructor data: \n firstname:");
					String fn = scanner.next();
					System.out.print("\n lastname:");
					String ln = scanner.next();
					System.out.print("\n department:");
					String dep = scanner.next();
					System.out.print("\n email:");
					String em = scanner.next();
					Instructor in = new Instructor (fn, ln, dep, em);
					instructors.add(in);
					bw.write("\n"+LocalDate.now()+" "+"admin added instructor "
										+in.getFirstName()+" "+in.getLastName());
					System.out.println("OK");
				}
				bw.close();
				FileOutputStream fos = new FileOutputStream("courses.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(courses);
				oos.flush();
				oos.close();
				fos = new FileOutputStream("textbooks.txt");
				oos = new ObjectOutputStream(fos);
				oos.writeObject(textbooks);
				oos.flush();
				oos.close();
				fos = new FileOutputStream("instructors.txt");
				oos = new ObjectOutputStream(fos);
				oos.writeObject(instructors);
				oos.flush();
				oos.close();
			} else System.out.println("Not valid password");
		} else {
			System.out.print("Hi, user! \n Choose action: \n 1) View courses");
			s = scanner.nextInt();
			if (s==1) {
				FileInputStream fis = new FileInputStream("courses.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				HashSet <Course> c = (HashSet <Course>) ois.readObject();
				for (Course c1: c)
					System.out.println(c1.getCourseTitle());
			}
		}
	}

}
