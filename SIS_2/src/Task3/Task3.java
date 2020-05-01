package Task3;

import java.util.ArrayList;
import java.util.Date;

public class Task3 {
	public static void main(String [] args) throws CloneNotSupportedException {
		Date date1 = new Date (01/11/2019);
		Date date2 = new Date (01/11/2016);
		Date date3 = new Date (01/11/2011);
		Date date4 = new Date (01/11/2020);
        Employee e1 = new Employee("A", 1200.0, date1, "18GHTY");
        Employee e2 = (Employee)e1.clone();
        Employee e3 = new Employee("F", 900.0, date2, "1HTY");
        Employee e4 = new Employee("Z", 100.0, date3, "2Y");
        Employee e5 = new Employee("T", 200.0, date4, "33TY");
        System.out.println("Employees:");
        System.out.println(e1);
        System.out.println(e1.compareTo(e2));
        System.out.println(e2.compareTo(e3));
        System.out.println(e4.compareTo(e5));
        System.out.println(e1.compareTo(e5));
        ArrayList<Employee> employee = new ArrayList<Employee>();
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);
        NameComparator NC = new NameComparator();
        employee.sort(NC);
        for (Employee e:employee)System.out.println(e.toString());
        Manager m1 = new Manager("A", 1200.0, date1, "18GHTY", 120, employee);
        Manager m2 = (Manager)m1.clone();
        Manager m3 = new Manager("B", 900.0, date1, "1HTY", 30, employee);
        System.out.println("Managers:");
        System.out.println(m1.compareTo(m2));
        System.out.println(m2.compareTo(m3));
        System.out.println(m3.compareTo(m1));
		
	}
}
