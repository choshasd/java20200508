
public class OverL {
	OverL(){
		doA();
		doA(1);
		doA(1,2);
	}
	private void doA(int i, int j) {
		System.out.println("i = "+i+", j = "+j);
	}
	private void doA(int i) {
		System.out.println("i = "+i);
	}
	private void doA() {
		System.out.println("doA ÇÔ¼ö");
	}
	public static void main(String[] args) {
		new OverL();
	}
}
