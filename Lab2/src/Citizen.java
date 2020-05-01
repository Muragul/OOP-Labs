
public class Citizen {
	public final String name; //��� �� �������� ����� ��������
	public int age; //������� ����� ������
	public String age_is;
	private enum person {
		child,
		teenager,
		adult
	}
	//������ ������ ������, ����� ��� ����
	private static String country = "Kazakhstan";
	//����� ���� � ���� �������, ������ �����
	public static String city = "Almaty";
	
	public Citizen(String name, int age) {
		this.name = name;
		this.age = age;
		convertAge();
	}
	
	void convertAge() {
		if (age<14) age_is = person.child+""; else
		if (age<18) age_is = person.teenager+""; else
		age_is = person.adult+"";
	}
	//����� �������� ���� ������ ���������
	//� ������ �� ���������, �� ��� ����� ������
	//�� � ������ ��� ���� ����� ��������
	public void changeAge(int age) {
		this.age = age;
		convertAge();
	}
	
	public void changeAge(String age_is) {
		this.age_is = age_is;
		if (age_is.equals("child"))age=7; else
			if (age_is.equals("teenager"))age=14; else
				age=18;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPerson() {
		return name+", "+age_is+", "+age+", "+city+", "+country;
	}
	//��� ������� ������ ���� ������ ������
	public String getCountry() {
		return country;
	}

}
