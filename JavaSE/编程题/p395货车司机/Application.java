public class Application{
	public static void main(String args[]){
		ThreadJoin a = new ThreadJoin();
		Thread driver = new Thread(a);
		Thread worker = new Thread(a);
		Thread manager = new Thread(a);
		driver.setName("货车司机");
		worker.setName("装运工");
		manager.setName("仓库管理员");
		a.setWorkerJoinThread(worker);
		a.setManagerJoinThread(manager);
		driver.start();
	}
}