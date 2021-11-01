public class Bank implements Runnable{
	int money = 200;
	public void setMoney(int n){
		money = n;
	}
	public void run(){
		if(Thread.currentThread().getName().equals("会计")){
			saveOrTake(300);
		}else if(Thread.currentThread().getName().equals("出纳")){
			saveOrTake(150);
		}
	}
	public synchronized void saveOrTake(int amount){  //synchronized修饰，进程同步，当一个进程使用该方法时，不允许其他进程使用
		if(Thread.currentThread().getName().equals("会计")){
			for(int i = 1; i <= 3; i++){
				money += amount/3;
				System.out.println(Thread.currentThread().getName()+"存入"+amount/3+"，账上有"+money+"万，休息一会再存");
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					
				}
			}
		}
		if(Thread.currentThread().getName().equals("出纳")){
			for(int i = 1; i <= 3; i++){
				money -= amount/3;
				System.out.println(Thread.currentThread().getName()+"取出"+amount/3+"，账上有"+money+"万，休息一会再取");
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					
				}
			}
		}
	}
}