
public class Student {
	public String name;
	public String surname;
	public int score;
	public char grade;
	public static int max = 0;
	
	public Student() {
		
	}
	
	public Student(String name, String surname, int score) {
		this.name = name;
		this.surname = surname;
		this.score = score;
	}
	
	public Student(String data) {
		String [] note = data.split(" ");
		this.name = note[0];
		this.surname = note[1];
		this.score = Integer.parseInt(note[2]);
	}
	
	public void traverseScore() {
		if (score >= max - 10)grade='A'; else
		if (score >= max - 20)grade='B'; else
		if (score >= max - 30)grade='C'; else
		if (score >= max - 40)grade='D'; else
		grade='F';
	}
	public String toString() {
		return this.name+" "+this.surname+" - "+this.grade;
	}
}
