import java.awt.event.*;
import java.io.*;
import javax.swing.event.*;
import javax.swing.*;
import java.util.*;

public class TextListener implements DocumentListener{
	JTextArea inputText, showText;
	public void setInputText(JTextArea Text){
		inputText = Text;
	}
	public void setShowText(JTextArea Text){
		showText = Text;
	}
	public void changedUpdate(DocumentEvent e){
		String str = inputText.getText();
		String regex = "[\\s\\d\\p{Punct}]+";
		String words[] = str.split(regex);
		Arrays.sort(words);
		showText.setText(null);
		for(int i = 0; i < words.length; i++){
			showText.append(words[i]+",");
		}
	}
	
	public void removeUpdate(DocumentEvent e){
		changedUpdate(e);
	}

	public void insertUpdate(DocumentEvent e){
		changedUpdate(e);
	}
}