class A{
	static int m;
	static void f(){
		m = 20;
		System.out.println("hello");
	}
}
class B extends A{
	void f(){
		m =222;
		System.out.println(m);
	}
}
class E{
	public static void main(String[] args) {
		A.f();
	}
}