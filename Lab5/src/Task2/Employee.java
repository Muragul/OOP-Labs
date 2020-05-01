package Task2;

import java.util.Date;

public class Employee extends Person implements Comparable<Object>{
	public double salary;
	public Date hireDate;
	public String insuranceNumber;
	
	public Employee() {
		super();
	}
	public Employee(String name, double salary, Date year, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = year;
		this.insuranceNumber = insuranceNumber;
	}
	
	public int compareTo(Object o) {   
		Employee e = (Employee) o;   
		if (salary < e.salary) return -1;   
		if (salary > e.salary) return 1;   
		return 0; 
	} 
	
	@Override 
	public boolean equals(Person p) {
		if (super.equals(p) && p instanceof Employee) {
			Employee e = (Employee) p;
			if (this.salary==e.salary && this.hireDate==e.hireDate 
					&& this.insuranceNumber.equals(e.insuranceNumber))
				return true;
					return false;
		} else
			return false;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+this.salary+" "+this.hireDate+" "+this.insuranceNumber;
	}

}
