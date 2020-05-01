import java.util.*;
public class Time {
	public int hour;
	public int minute;
	public int second;
	
	public static ArrayList<Time> times = new ArrayList<>();	
	
	public Time(){}
	
	public Time(int hour, int minute, int second) {
		if (hour<24 && minute<60 && second<60) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;			
		}
	}
	
	public void add(Time t2) {
		times.add(t2);
	}
	
	public String toUniversal() {
		String s = hour+":";
		if (minute<10) {
			s+="0"+minute+":";
		} else {
			s+=minute+":";
		}
		if (second<10) {
			s+="0"+second;
		} else {
			s+=second;
		}
		return s;
	}
	
	public String toStandart() {
		if (hour<13) {
			return toUniversal()+" AM";
		} else {
			String s = (hour-12)+":";
			if (minute<10) {
				s+="0"+minute+":";
			} else {
				s+=minute+":";
			}
			if (second<10) {
				s+="0"+second;
			} else {
				s+=second;
			}
			return s+" PM";
		}
	}
	
	public ArrayList<Time> getTimes(){
		return times;
	}

}
//����� ������ ��� ������ ������ ����� add
//��������� ������ ����� ������� ������ ���� ������ � ���� ���������
//��� 2 ��� ���� �� ��, ����� ������ ������� ������-�� ������
//���� ���� ������ ������� �� ��������, �� ����� ������ ����������� ��������
//����� ������ �������
//���� ������ - �� ������� ��� �����
//���� ��� - �� ����� ��� ���� �����, �� �������� �� ������� �����
//���� ����� � ������� ���� ������ ������, � � ������� ���� �����
//���� ��� � ��������� �� �������, � ��� �����, ������ ����������� � �� ���� 
//������������ ������ �� ��������