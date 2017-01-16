package _05.Java.Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _08_FlowLayout2 {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Window title");
		myFrame.setSize(300, 300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		
		
		
		JButton button = new JButton("button");
		JButton button2 = new JButton("button2");
		JButton button3 = new JButton("button3");
		JButton button4 = new JButton("button4");
		JTextField textField = new JTextField(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setPreferredSize(new Dimension(panel.getWidth(), 100)); // !!!! ТАК МОЖНО ЗАДАТЬ размер любого контейнера
		
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(textField);
		panel.setLayout(new FlowLayout());
		
		myFrame.setLayout(new BorderLayout());
		myFrame.add(panel, BorderLayout.SOUTH);
		myFrame.setVisible(true);

	}

}
