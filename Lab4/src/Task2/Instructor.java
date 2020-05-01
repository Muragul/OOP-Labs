package Task2;

import java.io.Serializable;
import java.util.Objects;

public class Instructor implements Serializable{
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	
	public Instructor() {}
	public Instructor(String first, String last, String dep, String email) {
		this.firstName = first;
		this.lastName = last;
		this.department = dep;
		this.email = email;
	}
	
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String getDepartment() {return department;}
	public String getEmail() {return email;}
	
	public void setFirstName(String s) {this.firstName = s;}
	public void setLastName(String s) {this.lastName = s;}
	public void setDepartment(String s) {this.department = s;}
	public void setEmail(String s) {this.email = s;}
	
	public String toString() {
		return this.firstName+" "+this.lastName+" "+this.department+" "+this.email;
	}
	@Override public boolean equals(Object o) {
		if (this == o)return true;
		if (!(o instanceof Instructor))return false;
		Instructor in = (Instructor) o;
		return Objects.equals(this.firstName, in.firstName) &&
				Objects.equals(this.lastName, in.lastName) &&
				Objects.equals(this.department, in.department) &&
				Objects.equals(this.email, in.email);
	}
	@Override public int hashCode() {
		return Objects.hash(firstName, lastName, department, email);
	}

}
