package _05.Java.Swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _07_BorderLayout {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Window title");
		myFrame.setSize(300, 300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		myFrame.setLayout(new BorderLayout()); // «¿—≈“≈À» 	Õ¿ JFrame layout		
				
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.BLUE);
		panel2.setBackground(Color.CYAN);
		panel3.setBackground(Color.GREEN);
		panel4.setBackground(Color.MAGENTA);
		panel5.setBackground(Color.ORANGE);
		
		myFrame.add(panel1, BorderLayout.PAGE_START);
		myFrame.add(panel2, BorderLayout.PAGE_END);
		myFrame.add(panel3, BorderLayout.CENTER);
		myFrame.add(panel4, BorderLayout.LINE_START);
		myFrame.add(panel5, BorderLayout.LINE_END);
		
		JButton button1 = new JButton("button1 text");
		JButton button2 = new JButton("button2 text");
		
		panel4.add(button1);
		panel4.add(button2);
		myFrame.setVisible(true);

	}

}
