package Task4;

public class Task4 {
	@SuppressWarnings("unchecked")
	public static void main(String [] args) {
		Chocolate c1 = new Chocolate("Twix", 20);
		Chocolate c2 = new Chocolate("Twix", 40);
		Chocolate c3 = new Chocolate("Twix", 100);
		Chocolate c4 = new Chocolate("Mars", 20);
		Chocolate c5 = new Chocolate("Mars", 40);
		Chocolate c6 = new Chocolate("Mars", 100);
		Chocolate [] array = {c1,c2,c3,c4,c5,c6};
		Sort.bubbleSort((Comparable[])array);
		for (int i=0;i<array.length;i++)
			System.out.print(array[i].toString());
		System.out.println();
		Sort.QuickSort((Comparable[])array, 0, array.length-1);
		for (int i=0;i<array.length;i++)
			System.out.print(array[i].toString());

		System.out.println();
		System.out.println();
		
		Time t1 = new Time(2,46,11);
		Time t2 = new Time(21,46,11);
		Time t3 = new Time(12,46,11);
		Time t4 = new Time(12,46,1);
		Time [] times = {t1,t2,t3,t4};
		Sort.bubbleSort((Comparable[])times);
		for (int i=0;i<4;i++)
			System.out.println(times[i].toString());
		System.out.println();
		Sort.QuickSort((Comparable[])times, 0, times.length-1);
		for (int i=0;i<4;i++)
			System.out.println(times[i].toString());
	}

}
