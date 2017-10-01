package _05.Java.Swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _09_GridLayout {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Window title");
		myFrame.setSize(300, 100);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		
		myFrame.setLayout(new BorderLayout());
		
		JButton button = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button10 = new JButton("0");
		
		JTextField displayFild = new JTextField();
		
		JPanel panelDisplay = new JPanel();
		panelDisplay.setLayout(new GridLayout());
		panelDisplay.add(displayFild);
		
		JPanel panelKey = new JPanel();
		panelKey.setLayout(new GridLayout(3, 4));
		
		panelKey.add(button);
		panelKey.add(button2);
		panelKey.add(button3);
		panelKey.add(button4);
		panelKey.add(button5);
		panelKey.add(button6);
		panelKey.add(button7);
		panelKey.add(button8);
		panelKey.add(button9);
		panelKey.add(button10);
				
		myFrame.add(panelDisplay, BorderLayout.NORTH);
		myFrame.add(panelKey, BorderLayout.CENTER);
		myFrame.setVisible(true);

	}

}
