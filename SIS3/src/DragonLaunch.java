import java.util.*;

public class DragonLaunch {
	public static Vector vector = new Vector();
	public static void main(String [] Args) {
		kidnap(new Person('B'));
		kidnap(new Person('B'));
		kidnap(new Person('G'));
		kidnap(new Person('G'));
		Stack stack = new Stack();
		for (int i=0;i<vector.size();i++) {
			if (!stack.isEmpty()&&stack.peek().equals('B')&&vector.get(i).equals('G'))
				stack.pop(); else stack.push(vector.get(i));
		}
		System.out.print(stack.size()+" students stay for launch");
	}
	public static void kidnap(Person p) {
		vector.add(p.g);
	}
}
//����� �� ����� ������ ����� ��� ������, ��� ��� ������������ � ��� ��������
//� ����� ���������