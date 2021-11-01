public class Example9_2{
	public static void main(String args[]){
		WindowActionEvent win = new WindowActionEvent();
		PoliceListen police = new PoliceListen();
		win.setMyCommandListener(police);
		win.setBounds(100, 200, 300, 400);
		win.setTitle("处理ActionEvent事件");
	}
}