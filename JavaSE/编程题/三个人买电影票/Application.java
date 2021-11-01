public class Application{
	public static void main(String args[]){
		TicketHouse officer = new TicketHouse();
		Thread zhangfei, likui, zhaoyun;
		zhangfei = new Thread(officer);
		likui = new Thread(officer);
		zhaoyun = new Thread(officer);
		zhangfei.setName("张飞");
		likui.setName("李逵");
		zhaoyun.setName("赵云");
		zhangfei.start();
		likui.start();
		zhaoyun.start();
	}
}