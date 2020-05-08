/*
public class Ex7 {
	
	int a = 10;
	int b = 20;
	Ex7(){
		
	}
	Ex7(int aa){
		a = aa;
	}
	Ex7(int aa, int bb){
		a = aa;
		b = bb;
	}
	public void doPrint() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println();
	}
	public static void main(String[] args) {
		Ex7 ex1 = new Ex7();
		Ex7 ex2 = new Ex7(11);
		Ex7 ex3 = new Ex7(11,22);
		ex1.doPrint();
		ex2.doPrint();
		ex3.doPrint();
	}
}
*/

public class ThisEx {
	int a = 10;
	int b = 20;
	
	ThisEx(){
		System.out.println("기본생성자");
		
	}
	ThisEx(int aa){
		this(); // 바로 위에 생성자 호출
		System.out.println("파라미터 한개 있는 생성자");
		a = aa;
	}
	ThisEx(int aa, int bb){
		this(); // 위에 생성자 호출
//		this(aa); 출력 : 기본생성자, 파라미터 한개 있는 생성자, 파라미터 두개 있는 생성자.
//  	this(aa); 를 해야 a = aa;를 호출하기때문에 ex3.doPrint();에서 a = 11 나올 수 있다.
		System.out.println("파라미터 두개 있는 생성자");
		b = bb;
	}
	public void doPrint() {
		System.out.println("a = "+a+", b = "+b);
		System.out.println();
	}
	public static void main(String[] args) {
		ThisEx ex1 = new ThisEx();
		System.out.println(); // 구분을 위함 
		ThisEx ex2 = new ThisEx(11);
		System.out.println();
		ThisEx ex3 = new ThisEx(11,22);
		System.out.println();
		
		ex1.doPrint();
		ex2.doPrint();
		ex3.doPrint();
	}
}