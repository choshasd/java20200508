class staticMethod{
	
	// doA���� a�� ����ϱ����ؼ� int a �� static���� �����ؾ���
	static int a = 0;
	
	public static void doA() {
		// int a = 0; ���� static�����ȿ� int a ���� ����
		System.out.println("����ƽ �޼���");
		System.out.println("a = "+a);
	}
}
public class StatEx {
	public static void main(String[] args) {
		staticMethod sm = new staticMethod();
		sm.doA();
		staticMethod.doA();
	}
}
