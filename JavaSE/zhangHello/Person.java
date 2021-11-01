public class Person{
	void speakHello(){
	   System.out.println("您好，很高兴见到您");
	   System.out.println("nice to meet you");
	}
}
class Xiti{
	public static void main(String args[]){
	   Person zhang = new Person();
	   zhang.speakHello();
	}
}