
public class Accumulator2 {
	static int total = 0;
	
	public void add(int a) {
		total += a;
	}
	public void showResult() {
		System.out.println("total = "+total);
	}
	public static void main(String[] args) {
		Accumulator2 Accumulator = new Accumulator2();
		for(int i = 0; i<10; i++) {
			Accumulator.add(i);			
		}
		Accumulator.showResult();
	}
}
