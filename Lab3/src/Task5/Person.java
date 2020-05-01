package Task5;

public class Person {
	public String name;
	public String address;
	
	public Person(String name, String address) {
		this.address = address;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "name: "+name+", address: "+address;
	}

}
