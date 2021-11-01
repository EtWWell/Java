import java.awt.*;
import javax.swing.*;
import java.io.*;
public class WindowOperation extends JFrame{
	JTextField inputNumberOne, inputNumberTwo;
	JComboBox choiceFuhao;
	JTextArea textShow;
	JButton button;
	OperatorListener operator;
	ComputerListener computer;
	public WindowOperation(){
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init(){
		setLayout(new FlowLayout());
		inputNumberOne = new JTextField(5);
		inputNumberTwo = new JTextField(5);
		choiceFuhao = new JComboBox();
		button = new JButton("计算");
		choiceFuhao.addItem("选择运算符号");
		choiceFuhao.addItem("+");
		choiceFuhao.addItem("-");
		choiceFuhao.addItem("*");
		choiceFuhao.addItem("/");
		textShow = new JTextArea(9, 30);
		operator = new OperatorListener();
		computer = new ComputerListener();
		operator.setJComboBox(choiceFuhao);
		operator.setWorkTogether(computer);
		computer.setJTextFieldOne(inputNumberOne);
		computer.setJTextFieldTwo(inputNumberTwo);
		computer.setJTextArea(textShow);
		choiceFuhao.addItemListener(operator);
		button.addActionListener(computer);
		add(inputNumberOne);
		add(choiceFuhao);
		add(inputNumberTwo);
		add(button);
		add(new JScrollPane(textShow));
	}
}