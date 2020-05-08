
public class Way {
	Way(){
		AccessWay aw = new AccessWay();
		aw.a++; // 1증가  1증가
		AccessWay.a++; // 1증가 1증가
		System.out.println("a = "+AccessWay.a); // 2 3
	}
	// static 선언시 종료되어도 계속 남기때문에 메인함수의
	// Way()를 위의 힙영역으로 보냄(메모리 낭비 방지)
	public static void main(String[] args) {
		new Way();
	}
}
