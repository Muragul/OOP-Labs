package Task3;

public class Person {
	public String name;
	
	public Person() {
		this.name = "undefined";
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public boolean equals(Person p) {
		if (this.name.equals(p.name))return true; else
			return false;
	}
	
	public String toString() {
		return this.name;
	}

}
