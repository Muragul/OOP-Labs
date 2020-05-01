package Task2;

import java.util.Objects;
import java.io.*;
public class Course implements Serializable {
	private String courseTitle;
	private Textbook txt;
	private Instructor in;
	
	public Course() {}
	public Course(String ct) {this.courseTitle = ct;}
	public Course(String ct, Textbook txt, Instructor in) {
		this.courseTitle = ct;
		this.txt = txt;
		this.in = in;
	}
	public Course(String ct, int isbn, String title, String author, String first, String last, String dep, String email) {
		this.courseTitle = ct;
		this.txt = new Textbook(isbn, title, author);
		this.in = new Instructor(first, last, dep, email);
	}
	public String getCourseTitle() {return courseTitle;}
	public void setCourseTitle(String t) {this.courseTitle = t;}
	
	public String toString() {
		return this.courseTitle+" "+txt.toString()+" "+in.toString();
	}
	@Override public boolean equals(Object o) {
		if (this == o)return true;
		if (!(o instanceof Course))return false;
		Course c = (Course) o;
		return Objects.equals(this.courseTitle, c.courseTitle) &&
				Objects.equals(this.txt, c.txt) &&
				Objects.equals(this.in, c.in);
	}
	@Override public int hashCode() {
		return Objects.hash(courseTitle, txt, in);
	}

}
