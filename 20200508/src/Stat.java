/*
 * �����Ϳ��� - static �������� �ְ� - ���α׷����ۿ��� ������� �����ϴ� ����
 * ���ÿ��� - �Լ� ���۽ÿ� ���������� �����ϰ� �Լ� ����ÿ� �ڵ����� ���ư��� ����
 * 
 * ������
 * c���- malloc �Լ��� free �Լ��� ���� �޸��Ҵ� ����
 * java���- new ��ü�� ���ؼ� �����ϸ� �޸��Ҵ��ϰ� jym�� �ڵ����� �޸𸮻󿡼� ������
 * */
class StaticVariable{
	public static int a = 0;
	public int b = 0;
//static������ ��� �����ϰ� �ƴѰ��� ��� 
	StaticVariable(){
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println(); // a �� b�� �񱳸� ����
		a++;
		b++;
	}
}
public class Stat {
	Stat(){
		StaticVariable sv1 = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();
		StaticVariable sv3 = new StaticVariable();
		System.out.println("sv1.a = "+sv1.a); // ����۾��� �ᵵ ������ �̷��� �Ⱦ��� �ؿ� StaticVariable.aó�� ��������
		System.out.println("sv2.a = "+sv2.a);
		System.out.println("sv3.a = "+sv3.a);
		System.out.println("StaticVariable.a = "+StaticVariable.a);
	}
	public static void main(String[] args) {
		new Stat();
	}
}
