public class House implements Runnable{
	int waterAmount;
	public void setWater(int w){
		waterAmount = w;
	}
	public void run(){
		while(true){
			String name = Thread.currentThread().getName();
			if(name.equals("狗")){
				System.out.println(name+"喝水");
				waterAmount = waterAmount - 2;
			}else if(name.equals("猫")){
				System.out.println(name+"喝水");
				waterAmount = waterAmount - 1;
			}
			System.out.println("剩"+waterAmount);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
			if(waterAmount <= 0){
				return;
			}
		}
	}
}