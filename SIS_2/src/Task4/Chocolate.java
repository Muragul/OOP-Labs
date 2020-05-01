package Task4;

public class Chocolate implements Comparable<Object>{
	public String name;
	public int weight;
	
	public Chocolate(String name, int w) {
		this.name = name;
		this.weight = w;
	}
	
	public String toString() {
		return name+" "+weight+" g.  ";
	}
	
	public int compareTo(Object c) {
		Chocolate choco = (Chocolate)c;
		if (choco.weight > this.weight) return -1;
		if (choco.weight < this.weight) return 1;
		return 0;
	}

}
