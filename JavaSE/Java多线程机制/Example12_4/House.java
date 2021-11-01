public class House implements Runnable{
	int waterAmount;
	Thread dog, cat;
	House(){
		dog = new Thread(this);
		cat = new Thread(this);
	}
	public void setWater(int w){
		waterAmount = w;
	}
	public void run(){
		while(true){
			Thread t = Thread.currentThread();
			if(t == dog){
				System.out.println("家狗喝水");
				waterAmount -= 2;
			}else if(t == cat){
				System.out.println("家猫喝水");
				waterAmount -= 1;
			}
			System.out.println("剩"+waterAmount);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
			if(waterAmount <= 0){
				return;
			}
		}
	}
}