public class user{
	public static void main(String args[]){
		//新建两张SIM卡
		SIM simone = new SIM(18914002323L);
		SIM simtwo = new SIM(15578692330L);
		//新建一部手机
		MobilePhone phone = new MobilePhone();
		//手机使用simone卡
		phone.setSIM(simone);
		System.out.println("现在的电话号码是:"+phone.sim.getNumber());
		//换手机卡，使用simtwo卡
		phone.setSIM(simtwo);
		System.out.println("我换手机号了，现在是："+phone.sim.getNumber());
	}
}