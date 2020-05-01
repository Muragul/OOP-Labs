package Task3;
import java.util.*;

public class Manager extends Employee{
	public ArrayList <Employee> team = new ArrayList<>();
	public int bonus;
	
	public Manager() {
		super();
	}
	public Manager(String name, double salary, int year, String insuranceNumber, int bonus) {
		super(name,salary,year,insuranceNumber);
		this.bonus = bonus;
	}
	public void addEmployee(Employee e) {
		this.team.add(e);
	}
	public void showTeam() {
		for (Employee e: team) 
			System.out.println(e.toString());
	}
	@Override
	public boolean equals(Person p) {
		if (super.equals(p) && p instanceof Manager) {
			Manager m = (Manager) p;
			if (this.bonus==m.bonus)return true;
			return false;
		} else
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+bonus;
	}
	
}
