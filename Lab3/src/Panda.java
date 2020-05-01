
public class Panda extends Animal {
	private int bamboo;
	private boolean knowsKungFu;
	
	public Panda() {
		super();
		this.bamboo = 0;
		this.knowsKungFu = false;
	}
	public Panda (String name, String sound, int bamboo, boolean knowsKungFu) {
		super(name, sound);
		this.bamboo = bamboo;
		this.knowsKungFu = knowsKungFu;
	}
	@Override public void eat(String food) {
		if (food.equals("bamboo")) {
			bamboo++;
			System.out.println("Ok");
		} else
			System.out.println("Do not eat "+food);
	}
	public void move(int y) {
		super.y = y;
		System.out.println("Moved to "+x+" "+y);
	}
	
	public void feed(int count) {
		this.bamboo = count;
	}
	public int getBamboo() {
		return bamboo;
	}
	public void teachKungFu(boolean teach) {
		this.knowsKungFu = teach;
	}
	public boolean isWarrior() {
		return knowsKungFu;
	}

}
