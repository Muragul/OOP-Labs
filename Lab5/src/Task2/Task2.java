package Task2;

import java.util.Date;

public class Task2 {
	public static void main(String[] args) {
		Date date = new Date(30/06/2000);
		Employee e1 = new Employee("A",100,date,"A");
		Employee e2 = new Employee("A",200,date,"A");
		Employee e3 = new Employee("A",600,date,"A");
		Employee e4 = new Employee("A",50,date,"A");
		Employee e5 = new Employee("A",270,date,"A");

		System.out.print(e1.compareTo(e1)+" ");
		System.out.print(e1.compareTo(e2)+" ");
		System.out.print(e1.compareTo(e3)+" ");
		System.out.print(e1.compareTo(e4)+" ");
		System.out.print(e1.compareTo(e5)+"\n");
		

		Manager m1 = new Manager("A",100,date,"A",3);
		Manager m2 = new Manager("A",100,date,"A",2);
		Manager m3 = new Manager("A",200,date,"A",3);
		Manager m4 = new Manager("A",50,date,"A",4);
		Manager m5 = new Manager("A",200,date,"A",5);
		
		System.out.print(m1.compareTo(m1)+" ");
		System.out.print(m1.compareTo(m2)+" ");
		System.out.print(m1.compareTo(m3)+" ");
		System.out.print(m1.compareTo(m4)+" ");
		System.out.print(m1.compareTo(m5)+"\n");
	}

}
