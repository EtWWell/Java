abstract class A{
	abstract float getFloat();
	void f(){

	}
}
public class B extends A{
	private float m = 1.0f;
	private float getFloat(){
		return m;
	}
}