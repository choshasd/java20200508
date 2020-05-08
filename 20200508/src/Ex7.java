
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
