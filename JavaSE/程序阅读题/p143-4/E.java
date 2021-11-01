class A{
	int m;
	int getM(){
		return m;
	}
	int seeM(){
		return m;
	}
}
class B extends A{
	int m;
	int getM(){
		return m + 100;
	}
}
public class E{
	public static void main(String args[]){
		B b = new B();
		b.m = 20;
		System.out.println(b.getM());
		A a = b;
		a.m = -100;
		System.out.println(a.getM());
		System.out.println(b.seeM());
	}
}