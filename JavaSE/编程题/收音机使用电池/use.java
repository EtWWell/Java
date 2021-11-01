public class use{
	public static void main(String args[]){
		Battary battary = new Battary(100);
		System.out.println("电量剩余："+battary.electricity);
		Radio radio = new Radio();
		radio.userRadio(battary);
		System.out.println("开始使用收音机。。。。");
		System.out.println("电量剩余："+battary.electricity);
	}
}