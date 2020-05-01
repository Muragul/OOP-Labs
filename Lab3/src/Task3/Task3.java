package Task3;

public class Task3 {
	public static void main(String Args[]) {
		Employee employee1 = new Employee("A", 100, 1, "fff");
		Employee employee2 = new Employee("A", 100, 1, "fff");
		Employee employee3 = new Employee("B", 100, 1, "f5");
		System.out.println(employee1.equals(employee2));
		System.out.println(employee1.equals(employee3));
		
		Manager manager1 = new Manager("A",100,1,"fff",1);
		Manager manager2 = new Manager("A",100,1,"fff",1);
		Manager manager3 = new Manager("A",100,1,"fff",7);
		System.out.println(manager1.equals(manager2));
		System.out.println(manager1.equals(manager3));
		
		System.out.println(employee1.toString());
		System.out.println(employee2.toString());
		System.out.println(employee3.toString());
		System.out.println(manager1.toString());
		System.out.println(manager2.toString());
		System.out.println(manager3.toString());
		
		manager1.addEmployee(employee1);
		manager1.addEmployee(employee2);
		manager1.addEmployee(employee3);
		manager1.showTeam();
	}

}
