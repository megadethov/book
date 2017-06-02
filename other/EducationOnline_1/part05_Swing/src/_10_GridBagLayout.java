package _05.Java.Swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class _10_GridBagLayout {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("јвторизаци€ в системе");
		myFrame.setSize(300, 300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		myFrame.setResizable(false);
		myFrame.setLayout(new GridBagLayout());	
		
		JLabel loginLable = new JLabel("Login:");
		JLabel passwordLable = new JLabel("Password:");
		
		JTextField loginField = new JTextField(10);
		JPasswordField passwordField = new JPasswordField(10);
		
		JButton loginButton = new JButton("login");
		JButton passwordButton = new JButton("register");
		
		
		
		/*
		 00 01 02 03 04 05 ...
		 10 11 12 13 14 15
		 20 21 22 23 24 25
		 30 31 32 33 34 35
		 ................
		 */
		
		/*		 
		 GridBagConstraints constrains = new GridBagConstraints(); // фишка, к-а€ управл€ет €чейкой
		 
		constrains.gridx = 3; // расположение по оси х слева направо
		constrains.gridy = 1; // расположение по оси y сверху вниз
		constrains.gridwidth = 1; // кол-во €чеек из к-ых состоит размер по оси х
		constrains.gridheight = 3; // кол-во €чеек из к-ых состоит размер по оси y
		constrains.weightx = 0.0;
		constrains.weighty = 0.9;
		constrains.anchor = GridBagConstraints.NORTH;
		constrains.fill = GridBagConstraints.HORIZONTAL;
		constrains.insets = new Insets(100, 2, 3, 4); // отступы top - left - bottom - right
		constrains.ipadx = 0; // дельта приращени€ к размеру по х
		constrains.ipady = 0; // дельта приращени€ к размеру по y
		
		myFrame.add(loginButton, constrains); // кидаем на фрейм  коппонент и управл€ющую фишку	
		*/				
		
		
		myFrame.add(loginLable, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(loginField, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(passwordLable, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(passwordField, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(loginButton, new GridBagConstraints(0, 2, 2, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.add(passwordButton, new GridBagConstraints(0, 3, 2, 1, 0.0, 0.9, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
		
		myFrame.pack(); //сжимает фрейм по размерам контента
		myFrame.setVisible(true);

	}

}
