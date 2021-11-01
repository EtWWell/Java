public class Example12_10{
	public static void main(String args[]){
		Deamon a = new Deamon();
		a.A.start();
		a.B.setDaemon(true); //守护进程
		a.B.start();
	}
}