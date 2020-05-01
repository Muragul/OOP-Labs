
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
//����� ������ ����� ������ ����� ������ ���� � ������
//������� ������ ������� ��������� �������� � �����, ����� �� ������� ������
//��� ����� � �������������, ������� � ������ ����� � ������������ ����
//����� ��� ����: �����, ���� � �������