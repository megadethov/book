package _05.Java.Swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class _04_JLabel {

	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("Window title");
		myFrame.setSize(300, 300);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		myFrame.setLayout(layout);
		
		JLabel label1 = new JLabel("Label text");
		Font font = new Font("Verdana", Font.ITALIC, 25); // создаем инстанс шрифта
		label1.setFont(font); // сетим шрифт на лейбл
		label1.setForeground(Color.RED); // сетим цвет тексту лейбла		
		
		myFrame.add(label1);
		myFrame.setVisible(true);

	}

}
