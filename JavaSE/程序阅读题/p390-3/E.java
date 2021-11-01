public class E{
	public static void main(String args[]){
		Target target = new Target();
		Thread thread = new Thread(target);
		// thread.start();
		target.run();
		for(int i = 0; i <= 10; i++){
			System.out.println("yes");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}
class Target implements Runnable{
	public void run(){
		for(int i = 0; i <= 10; i++){
			System.out.println("ok");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}