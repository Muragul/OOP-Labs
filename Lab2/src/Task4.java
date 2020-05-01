import java.util.*;

public class Task4 {
	public static void main(String args[]) {
		Time time = new Time(14,23,6);
		System.out.println(time.toStandart());
		System.out.println(time.toUniversal());
		Time t2 = new Time(4,23,33);
		time.add(t2);
		t2.add(time);
		ArrayList <Time> times = time.getTimes();
		System.out.println("Array:");
		for (Time t: times)
			System.out.println(t.toUniversal());
	}

}

//—ильно запуталась с тем, что мы делаем с методом add
//Ќаучилась (вспомнила как) проходитьс€ по массиву не инт