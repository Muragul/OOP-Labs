
public class Person {
	public enum Gender {
		boy,
		girl
	}
	public String name;
	public Gender gender;
	public char g;
	
	public Person() {
		this.gender = Gender.boy;
		this.g = 'B';
		this.name = "Nursultan";
	}
	
	public Person(char gender) {
		if (gender == 'G') this.gender = Gender.girl;
		else this.gender = Gender.boy;
		g = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {return name+"";}
}
//добавила enum, но он используется только в самом классе
//для самой программы достаточно просто букв