import javax.swing.*;
import java.util.Date;
public class E{
	public static void main(String args[]){
		javax.swing.Timer time = new javax.swing.Timer(500, new A());
		time.setInitialDelay(0);
		time.start();
	}
}
class A extends JLabel implements java.awt.event.ActionListener{
	public void actionPerformed(java.awt.event.ActionEvent e){
		System.out.println(new Date());
	}
}