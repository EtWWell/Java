public class Application{
	public static void main(String args[]){
		ClassRoom room6501 = new ClassRoom();
		room6501.student1.start();
		room6501.student2.start();
		room6501.teacher.start();
	}
}