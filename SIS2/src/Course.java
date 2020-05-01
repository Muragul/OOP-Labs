import java.util.*;
public class Course {
	public String name;
	public String description;
	public int credits;
	public ArrayList<Course> prerequisites = new ArrayList<>();
	
	public Course() {}
	public Course(String name, int credits) {
		this.name = name;
		this.credits = credits;
	}
	public String toString() {
		return name+" "+description+" "+credits;
	}
}
//не знала что делать с пререквезитами, думала оставить как String, но потом
//поняла что будут такие же курсы, то есть список предметов