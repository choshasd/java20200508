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
		System.out.println("�⺻������");
		
	}
	ThisEx(int aa){
		this(); // �ٷ� ���� ������ ȣ��
		System.out.println("�Ķ���� �Ѱ� �ִ� ������");
		a = aa;
	}
	ThisEx(int aa, int bb){
		this(); // ���� ������ ȣ��
//		this(aa); ��� : �⺻������, �Ķ���� �Ѱ� �ִ� ������, �Ķ���� �ΰ� �ִ� ������.
//  	this(aa); �� �ؾ� a = aa;�� ȣ���ϱ⶧���� ex3.doPrint();���� a = 11 ���� �� �ִ�.
		System.out.println("�Ķ���� �ΰ� �ִ� ������");
		b = bb;
	}
	public void doPrint() {
		System.out.println("a = "+a+", b = "+b);
		System.out.println();
	}
	public static void main(String[] args) {
		ThisEx ex1 = new ThisEx();
		System.out.println(); // ������ ���� 
		ThisEx ex2 = new ThisEx(11);
		System.out.println();
		ThisEx ex3 = new ThisEx(11,22);
		System.out.println();
		
		ex1.doPrint();
		ex2.doPrint();
		ex3.doPrint();
	}
}