import java.util.*;
public class Task3 {
	public static void main(String args[]) {
		Data data = new Data();
		data.addValue(17);
		data.addValue(24);
		data.addValue(3);
		data.addValue(-44);
		data.addValue(50);
		System.out.println(data.getAverage());
		System.out.print(data.getLargest());
	}

}

//В этом доке пыталась проверить работает ли вообще класс
//Добавляла разные значения сразу через программу