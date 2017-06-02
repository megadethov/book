package _05.Java.Swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _08_FlowLayout {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Window title");
		myFrame.setSize(300, 300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		
		myFrame.setLayout(new FlowLayout());
		
		JButton[] buttons = new JButton[10]; // создаем массив дл€ хранени€ объектов типа JButton
		
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(String.valueOf(i)); // в каждую €чейку массива ложим инстанс JButton
			myFrame.add(buttons[i]);
		}		
		
		myFrame.setVisible(true);

	}

}
