
public class Student {
	public String name;
	public int id;
	public int year_of_study=0;
	
	public Student() {};
	
	public Student (String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String print() {
		incrementYear();
		return name +" "+ id +" "+year_of_study+"\n";
	}
	public void incrementYear() {
		this.year_of_study++;
	}
}

//Научилась импортировать класс
//Такая же задача была на ПП2 на с#
//В обоих семестрах не поняла смысла выводить одно и то же