package Task1a;

public abstract class Food {
	public int weight;
	public String state;
	private String [] ingredients;

	public abstract double calories();
	
	public abstract String serving();
	
	public boolean isDrinkable() {
		if (state.equals("liquid"))return true;
		return false;
	}
}