
public class Way {
	Way(){
		AccessWay aw = new AccessWay();
		aw.a++; // 1����  1����
		AccessWay.a++; // 1���� 1����
		System.out.println("a = "+AccessWay.a); // 2 3
	}
	// static ����� ����Ǿ ��� ���⶧���� �����Լ���
	// Way()�� ���� ���������� ����(�޸� ���� ����)
	public static void main(String[] args) {
		new Way();
	}
}
