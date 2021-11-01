public class E{
	public static void main(String args[]){
		Target target1 = new Target();
		Target target2 = new Target();
		Thread thread1 = new Thread(target1);
		Thread thread2 = new Thread(target2);
		thread1.start();
		try{
			Thread.sleep(1000);
		}catch(Exception e){

		}
		thread2.start();
	}
}
class Target implements Runnable{
	int i = 0;
	public void run(){
		i++;
		System.out.println("i="+i);
	}
}