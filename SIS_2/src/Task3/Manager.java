package Task3;

import java.util.ArrayList;
import java.util.Date;

public class Manager extends Employee implements Comparable<Object>, Cloneable{
	public ArrayList <Employee> team = new ArrayList<>();
	public int bonus;
	
	public Manager() {
		super();
	}
	public Manager(String name, double salary, Date year, String insuranceNumber, int bonus, ArrayList<Employee> e) {
		super(name,salary,year,insuranceNumber);
		this.team = e;
		this.bonus = bonus;
	}
	public void addEmployee(Employee e) {
		this.team.add(e);
	}
	public void showTeam() {
		for (Employee e: team) 
			System.out.println(e.toString());
	}
	
	public Object clone() throws CloneNotSupportedException {
		Manager clone = (Manager)super.clone();
		clone.bonus = this.bonus;
		ArrayList <Employee> t = new ArrayList<>();
		for (Employee e: this.team){
			t.add((Employee)e.clone());
		}
		clone.team = t;
		return clone;
	}
	
	public int compareTo(Object o) {
		Manager m = (Manager) o;
		if (super.compareTo(m)==0) {
			if (bonus < m.bonus) return -1;
			if (bonus > m.bonus) return 1;
			return 0;
		}
		return super.compareTo(m);
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
