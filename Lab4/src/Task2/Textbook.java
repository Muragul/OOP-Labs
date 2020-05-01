package Task2;

import java.io.Serializable;
import java.util.Objects;

public class Textbook implements Serializable{
	private int isbn;
	private String title;
	private String author;
	
	public Textbook() {}
	public Textbook(int isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	public int getIsbn() {return isbn;}
	public String getTitle() {return title;}
	public String getAuthor() {return author;}
	
	public void setIsbn(int isbn) {this.isbn = isbn;}
	public void setTitle(String title) {this.title = title;}
	public void setAuthor(String author) {this.author = author;}
	
	public String toString() {
		return this.isbn+" "+this.title+" "+this.author;
	}
	@Override public boolean equals(Object o) {
		if (o==this)return true;
		if (!(o instanceof Textbook))return false;
		Textbook txt = (Textbook) o;
		return this.isbn == txt.isbn &&
				Objects.equals(this.title, txt.title) &&
				Objects.equals(this.author, txt.author);
	}
	@Override public int hashCode() {
		return Objects.hash(title, author);
	}

}
