class MyOut{
	static void doA() {
		System.out.println("MyOut doA ÇÔ¼ö");
	}
}
class Syste{
	static MyOut mo = new MyOut();
}
public class Ex6 {
	Ex6(){
		Syste.mo.doA();
	}
	public static void main(String[] args) {
		new Ex6();
	}
}
