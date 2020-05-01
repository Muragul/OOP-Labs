package students;

public class Student {
	public String name;
	public int id;
	public int year_of_study=0;
	public int grade;
	
	public Student() {};
	
	public Student (String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public double getGrade() {
		return grade;
	}
	public String toString() {
		return name+": ";
	}
	public String print() {
		incrementYear();
		return name +" "+ id +" "+year_of_study+"\n";
	}
	public void incrementYear() {
		this.year_of_study++;
	}
}
//сделала здесь отдельный метод toString чтобы выводить только имя, когда
//программа просит учителя выставить оценки
//добавила филд с оценкой