package Task3;

public class Employee extends Person{
	public double salary;
	public int year;
	public String insuranceNumber;
	
	public Employee() {
		super();
	}
	public Employee(String name, double salary, int year, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.year = year;
		this.insuranceNumber = insuranceNumber;
	}
	
	@Override 
	public boolean equals(Person p) {
		if (super.equals(p) && p instanceof Employee) {
			Employee e = (Employee) p;
			if (this.salary==e.salary && this.year==e.year 
					&& this.insuranceNumber.equals(e.insuranceNumber))
				return true;
					return false;
		} else
			return false;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+this.salary+" "+this.year+" "+this.insuranceNumber;
	}

}
