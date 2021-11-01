import javax.swing.*;
import java.awt.*;

public class Example9_1{
	public static void main(String args[]){
		JFrame window1 = new JFrame("第一个窗口");
		JFrame window2 = new JFrame("第二个窗口");  //新建两个窗口

		Container con = window1.getContentPane();
		con.setBackground(Color.yellow);  //设置window1的颜色

		window1.setBounds(60, 100, 188, 108);
		window2.setBounds(260, 100, 188, 108); //设置窗口在屏幕上的位置以及大小

		window1.setVisible(true);    //设置窗口的可见性，默认为false
		// window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //点击关闭窗口时的含义（方法的参数为含义）

		window2.setVisible(true);
		// window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}