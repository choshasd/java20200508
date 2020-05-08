
public class ThisData {
	private int a = 10;
	
	public ThisData(int a) {
		this.a = a;
	}
	public void showA() {
		System.out.println("a = "+a);
	}
	public static void main(String[] args) {
		ThisData ex10 = new ThisData(20);
		ex10.showA();
	}
}
