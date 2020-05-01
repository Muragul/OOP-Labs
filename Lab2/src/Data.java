
public class Data {
	private double sum;
	private double max;
	private int cnt;

	public Data() {
		sum = 0;
		max = 0;
		cnt = 0;
	}
	
	public void addValue(double value) {
		if (cnt==0 || max<value)
			max = value;
		cnt++;
		sum +=value;
	}
	
	public double getAverage() {
		if (cnt==0)return 0;
		return sum/cnt;
	}
	
	public double getLargest() {
		return max;
	}
}
//Долго думала какие именно филды должны быть у класса
//Сначала думала хранить введенное значение в филде, потом не хватало филдов
//для суммы и максимального, поэтому в методе сразу и использовала этот
//валью где надо: сумма, макс и счетчик