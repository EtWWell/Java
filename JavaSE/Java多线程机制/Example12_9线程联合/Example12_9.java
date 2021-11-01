public class Example12_9{
	public static void main(String args[]){
		ThreadJoin a = new ThreadJoin();
		Thread customer = new Thread(a);
		Thread cakeMaker = new Thread(a);
		customer.setName("顾客");
		cakeMaker.setName("蛋糕");
		a.setJoinThread(cakeMaker);
		customer.start();
	}
}