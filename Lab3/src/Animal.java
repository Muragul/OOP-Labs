
public class Animal {
	private String name;
	private String sound;
	public int x;
	public int y;
	
	public Animal() {
		name = "no_name_yet";
		sound = "no_sound_yet";
	}
	public Animal (String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	public void move (int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Moved to " + x + " "+y);
	}
	public void eat(String food) {
		System.out.println("ok");
	}

	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound (String sound) {
		this.sound = sound;
	}
}
