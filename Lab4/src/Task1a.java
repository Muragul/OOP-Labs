import java.io.*;
import java.util.*;

public class Task1a {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		FileReader fr = new FileReader("scores.txt");
		BufferedReader br = new BufferedReader(fr);
		HashSet <Student> list = new HashSet<>();		
		
		String line = br.readLine();
		while (line != null) { 
			list.add(new Student(line));
			line = br.readLine();
			} 
		br.close();
		for (Student s: list) {
			if (s.score>Student.max)Student.max = s.score;
		}
		for (Student s: list) {
			s.traverseScore();
		}
		FileWriter fw = new FileWriter("grades.txt");
		PrintWriter pw = new PrintWriter(fw);
		for (Student s: list) {
			pw.println(s.toString());
		}
		pw.close();
	}

}
