import javax.swing.*;
import java.awt.event.*;

public class PoliceListen implements MyCommandListener{
	JTextField inputText;
	JTextArea textShow;
	public void setJTextField(JTextField a){
		inputText = a;
	}
	public void setJTextArea(JTextArea b){
		textShow = b;
	}
	public void actionPerformed(ActionEvent e){
		String str = inputText.getText();
		textShow.append(str+"的长度:"+str.length()+"\n");
	}
}