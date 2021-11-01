public class TicketHouse implements Runnable{
	int fiveAmount = 3, tenAmount = 0, twentyAmount = 0;
	public void run(){
		if(Thread.currentThread().getName().equals("张飞")){
			saleTicket(20);
		}else if(Thread.currentThread().getName().equals("李逵")){
			saleTicket(10);
		}else if(Thread.currentThread().getName().equals("赵云")){
			saleTicket(5);
		}
	}
	private synchronized void saleTicket(int money){
		if(money == 5){
			fiveAmount += 1;
			System.out.println(Thread.currentThread().getName()+"钱正好，给他入场券");
		}else if(money == 10){
			while(fiveAmount < 1){
				try{
					System.out.println("\n"+Thread.currentThread().getName()+"靠边等……");
				    wait();
				    System.out.println("\n"+Thread.currentThread().getName()+"继续买票");
				}catch(InterruptedException e){}
			}
			tenAmount += 1;
			fiveAmount -= 1;
			System.out.println(Thread.currentThread().getName()+"给了10元，找了他5元");
		}else if (money == 20){
			while(fiveAmount < 3){
				try{
					System.out.println("\n"+Thread.currentThread().getName()+"靠边等……");
					wait();
					System.out.println("\n"+Thread.currentThread().getName()+"继续买票");
				}catch(InterruptedException e){

				}
			}
			fiveAmount -= 3;
			twentyAmount += 1;
			System.out.println(Thread.currentThread().getName()+"给了20元，找15元");
		}
		notifyAll();
	}
}