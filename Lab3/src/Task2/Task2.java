package Task2;

public class Task2 {
	public static void main(String Args[]) {
		Cube cube = new Cube("red", 4);
		Cylinder cylinder = new Cylinder("blue", 1, 1);
		Sphere sphere = new Sphere("black", 2);
		System.out.println(cube.volume()+"");
		System.out.println(cylinder.volume()+"");
		System.out.println(sphere.volume()+"");
		
		System.out.println(cube.surfaceArea()+"");
		System.out.println(cylinder.surfaceArea()+"");
		System.out.println(sphere.surfaceArea()+"");
		
		System.out.println(cube.isHollow());
		System.out.println(cylinder.isHollow());
		System.out.println(sphere.isHollow());
	}

}
