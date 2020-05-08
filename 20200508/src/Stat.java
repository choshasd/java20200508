/*
 * 데이터영역 - static 변수들이 있고 - 프로그램시작에서 종료까지 존재하는 변수
 * 스택영역 - 함수 시작시에 지역변수인 선언하고 함수 종료시에 자동으로 날아가는 변수
 * 
 * 힙영역
 * c언어- malloc 함수와 free 함수로 직접 메모리할당 해제
 * java언어- new 객체를 통해서 선언하면 메모리할당하고 jym이 자동으로 메모리상에서 날린다
 * */
class StaticVariable{
	public static int a = 0;
	public int b = 0;
//static변수는 계속 증가하고 아닌것은 계속 
	StaticVariable(){
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println(); // a 와 b의 비교를 위함
		a++;
		b++;
	}
}
public class Stat {
	Stat(){
		StaticVariable sv1 = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();
		StaticVariable sv3 = new StaticVariable();
		System.out.println("sv1.a = "+sv1.a); // 노란글씨는 써도 되지만 이렇게 안쓰고 밑에 StaticVariable.a처럼 쓰면좋다
		System.out.println("sv2.a = "+sv2.a);
		System.out.println("sv3.a = "+sv3.a);
		System.out.println("StaticVariable.a = "+StaticVariable.a);
	}
	public static void main(String[] args) {
		new Stat();
	}
}
