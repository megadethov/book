package _05.Java.Swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _06_JPanel {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Window title");
		myFrame.setSize(300, 300);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		myFrame.setLayout(layout);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.ORANGE);	
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLUE);
		
		JButton button1 = new JButton("Text button 1");	
		
		myFrame.add(panel1);
		panel1.add(panel2);
		panel1.add(button1);
		
		Component[] component = panel1.getComponents(); // getComponents() вытягивает сомпоненты из panel1
		                                                // и ложит в массив типа Component (java.awt.Component - родитель)
		for (int i = 0; i < component.length; i++) {
			if (component[i] instanceof JPanel) System.out.println("JPanel");
			if (component[i] instanceof JButton) {				
				System.out.println("JBatton");		
				// чтобы использовать метод подкласса JButton getText() нужно тип суперкласса Component привести к (JButton)
			    String componentText =((JButton) component[i]).getText(); 
			    System.out.println("Text on button is: " + componentText);
			}
			
		}
		
		
		
		myFrame.setVisible(true);

	}

}
