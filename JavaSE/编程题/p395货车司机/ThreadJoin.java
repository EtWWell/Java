public class ThreadJoin implements Runnable{
	HuoWu huowu;
	Thread workerJoinThread, managerJoinThread;
	public void setWorkerJoinThread(Thread t){
		workerJoinThread = t;
	}
	public void setManagerJoinThread(Thread t){
		managerJoinThread = t;
	}
	public void run(){
		if(Thread.currentThread().getName().equals("货车司机")){
			System.out.println(Thread.currentThread().getName()+"等待"+workerJoinThread.getName()+"搬运货物上车");
			try{
				workerJoinThread.start();
				workerJoinThread.join();
			}catch(InterruptedException e){

			}
			System.out.println(Thread.currentThread().getName()+"载着"+huowu.Height+"吨，共"+huowu.number+"件货物走了");
		}else if(Thread.currentThread() == workerJoinThread){
			System.out.println(Thread.currentThread().getName()+"等待仓库管理员打开仓库");
			try{
				managerJoinThread.start();
				managerJoinThread.join();
			}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+"开始搬运货物到货车上，请司机等待……");
			try{
				Thread.sleep(4000);
			}catch(InterruptedException e){}
			huowu = new HuoWu(200, 50);
			System.out.println(Thread.currentThread().getName()+"搬了"+huowu.Height+"吨，共"+huowu.number+"件货物上货车");
		}else if(Thread.currentThread() == managerJoinThread){
			System.out.println(Thread.currentThread().getName()+"打开仓库");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+"把仓库打开了");
		}
	}
	class HuoWu{
		int Height;
		int number;
		HuoWu(int Height, int number){
			this.Height = Height;
			this.number = number;
		}
	}
}