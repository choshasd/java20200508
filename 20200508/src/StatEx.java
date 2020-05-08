class staticMethod{
	
	// doA에서 a를 사용하기위해선 int a 를 static으로 선언해야함
	static int a = 0;
	
	public static void doA() {
		// int a = 0; 으로 static영역안에 int a 선언 가능
		System.out.println("스태틱 메서드");
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
