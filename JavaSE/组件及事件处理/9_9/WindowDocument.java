import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;

public class WindowDocument extends JFrame{
	JTextArea inputText, showText;
	JMenuBar menubar;
	JMenu menu;
	JMenuItem itemCopy, itemCut, itemPaste;
	TextListener textChangeListener;
	HandleListener handleListener;
	WindowDocument(){
		init();
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init(){
		inputText = new JTextArea(15, 20);
		showText = new JTextArea(15, 20);
		showText.setLineWrap(true);
		showText.setWrapStyleWord(true);
		menubar = new JMenuBar();
		menu = new JMenu("编辑");
		itemCopy = new JMenuItem("复制(C)");
		itemCut = new JMenuItem("剪切(T)");
		itemPaste = new JMenuItem("粘贴(P)");
		itemCopy.setAccelerator(KeyStroke.getKeyStroke('c'));
		itemCut.setAccelerator(KeyStroke.getKeyStroke('t'));
		itemPaste.setAccelerator(KeyStroke.getKeyStroke('p'));
		itemCopy.setActionCommand("copy");
		itemCut.setActionCommand("cut");
		itemPaste.setActionCommand("paste");
		menu.add(itemCopy);
		menu.add(itemCut);
		menu.add(itemPaste);
		menubar.add(menu);
		setJMenuBar(menubar);
		add(new JScrollPane(inputText));
		add(new JScrollPane(showText));
		textChangeListener = new TextListener();
		handleListener = new HandleListener();
		textChangeListener.setInputText(inputText);
		textChangeListener.setShowText(showText);
		handleListener.setInputText(inputText);
		handleListener.setShowText(showText);
		(inputText.getDocument()).addDocumentListener(textChangeListener);
		itemCopy.addActionListener(handleListener);
		itemCut.addActionListener(handleListener);
		itemPaste.addActionListener(handleListener);
	}
}