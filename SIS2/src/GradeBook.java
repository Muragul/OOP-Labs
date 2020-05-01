import students.Student;
import java.util.*;

public class GradeBook {
	public Course course;
	public ArrayList <Student> students = new ArrayList<>();

	public GradeBook() {}
	public GradeBook(Course course, ArrayList <Student> students) {
		this.course = course;
		this.students = students;
	}
	public String displayMessage() {
		return "Welcome to the grade book for CS101 "+this.course.name+"!\n\nPlease, input grades for students:\n";
	}
	public String displayGradeReport() {
		String s="";
		s+="Class average is "+getAverage()+".\nLowest grade is "+getLowest()+".\nHighest grade is "+getHighest()+".\n\n"+getBarChart();
		return s;
	}
	public String getLowest() {
		int min=100;
		Student badStudent = new Student();
		for (int i=0;i<students.size();i++) {
			if (students.get(i).grade<min) {
				min=students.get(i).grade;
				badStudent = students.get(i);
			}
		}
		return min+"("+badStudent.name+", id: "+badStudent.id+")";
	}

	public String getHighest() {
		int max=0;
		Student bestStudent = new Student();
		for (int i=0;i<students.size();i++) {
			if (students.get(i).grade>max) {
				max=students.get(i).grade;
				bestStudent = students.get(i);
			}
		}
		return max+"("+bestStudent.name+", id: "+bestStudent.id+")";
	}
	public String getBarChart() {
		String s="Grades distribution:\n";
		String[] array = BarChart();
		for (int i=0;i<11;i++) {
			s+=array[i]+"\n";
		}
		return s;
	}
	public String[] BarChart() {
		String[] array = {
				"00-09: ",
				"10-19: ",
				"20-29: ",
				"30-39: ",
				"40-49: ",
				"50-59: ",
				"60-69: ",
				"70-79: ",
				"80-89: ",
				"90-99: ",
				"100: "
				};
		for (int i=0;i<students.size();i++) {
			if (students.get(i).grade<10)array[0]+="*"; else
			if (students.get(i).grade<20)array[1]+="*"; else
			if (students.get(i).grade<30)array[2]+="*"; else
			if (students.get(i).grade<40)array[3]+="*"; else
			if (students.get(i).grade<50)array[4]+="*"; else
			if (students.get(i).grade<60)array[5]+="*"; else
			if (students.get(i).grade<70)array[6]+="*"; else
			if (students.get(i).grade<80)array[7]+="*"; else
			if (students.get(i).grade<90)array[8]+="*"; else
			if (students.get(i).grade<100)array[9]+="*"; else
				array[10]+="*";
		}
		return array;
	}
	public double getAverage() {
		double sum=0;
		for (int i=0;i<students.size();i++) {
			sum+=students.get(i).grade;
		}
		return sum/students.size();
	}

}
//долго думала как реализовать барчарт
//забыла что есть обычные массивы
//после первой лабки все время использую теперь \n