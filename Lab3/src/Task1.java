public class Task1 {
	public static void main(String Args[]) {
		Panda panda = new Panda();
		Animal animal = new Animal();
		animal.eat("light");
		panda.eat("light");
		panda.eat("bamboo");
		
		panda.move(1,1);
		animal.move(1,2);
		panda.move(5);
	}
}
