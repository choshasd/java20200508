public class Accumulator{
	static int total = 0;
	
	static void add(int a) {
		total += a;
	}
	static void showResult() {
		System.out.println("total = "+total);
	}
	public static void main(String[] args) {
		
		for(int i = 0;i<10;i++) {
			Accumulator.add(i);
		}
		Accumulator.showResult();
	}
}
