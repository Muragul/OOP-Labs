
public class Citizen {
	public final String name; //имя не меняется после рождения
	public int age; //возраст можно менять
	public String age_is;
	private enum person {
		child,
		teenager,
		adult
	}
	//страну нельзя менять, общая для всех
	private static String country = "Kazakhstan";
	//город один у всех жителей, менять можно
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
	//метод оверлоад было сложно придумать
	//в задаче не идеальный, не для тупых юзеров
	//но я поняла как этот метод работает
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
	//для ридонли страны есть только геттер
	public String getCountry() {
		return country;
	}

}
