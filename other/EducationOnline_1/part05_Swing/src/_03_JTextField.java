package _05.Java.Swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class _03_JTextField {

	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("Window title");
		myFrame.setSize(300, 300);	
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		myFrame.setLayout(layout);
		
		JButton button1 = new JButton("Title button1");
		
		JTextField textField1 = new JTextField(10); // текст поле (ширина в констр)
		textField1.setText("default text"); // пердустановленный текст в поле
		System.out.println(textField1.getText()); // вытащить текст из поля
		textField1.setEditable(false); // блочит редактирование поля
		
		JPasswordField passwordField1 = new JPasswordField(10); // аналог JTextField (скрывает символы)
		passwordField1.setBackground(Color.green);
		 
		myFrame.add(button1);
		myFrame.add(textField1);
		myFrame.add(passwordField1);
		
		myFrame.setVisible(true); // лучше ставить в конец

	}

}
