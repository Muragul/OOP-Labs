import java.util.*;

public class Task5 {
	public static void main(String Args[]) {
		Citizen c1 = new Citizen("A", 17);
		Citizen c2 = new Citizen("B", 11);
		Citizen c3 = new Citizen("C", 28);
		System.out.println(c1.getPerson());
		System.out.println(c2.getPerson());
		System.out.println(c3.getPerson());
		c1.setCity("Nursultan");
		System.out.println(c1.getPerson());
		System.out.println(c2.getPerson());
		System.out.println(c3.getPerson());
		c1.changeAge(29);
		c2.changeAge("teenager");
		System.out.println(c1.getPerson());
		System.out.println(c2.getPerson());
	}
	
}

//������ ����� ��������� ���� ����, ������ ��� ����� ���� �� ������ ������
//� ��������� package, � �� java ����������� ������ ������

//����� ������� ���� ��������� ��������� ������
//�����: ���������� � ������� ������ ������ ����������