// компоненты
// размещение		
// слушатели


package _05.Java.Swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _02_Button {

	public static void main(String[] args) {
		JFrame myFrame = new JFrame("MyWindow title");	
		myFrame.setSize(300, 300);		
		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout(); // создаем менеджер размещения компонентов
		myFrame.setLayout(layout); // подкл к окну менеджер размещения
		
		JButton button1 = new JButton("button text1");
		// button1.setText("button text"); // вариант подписать кнопку
		button1.setBackground(Color.RED); // c помощью константы
		JButton button2 = new JButton("button text2");
		button2.setBackground(new Color(200, 200, 200)); // c помощью new
		button2.setForeground(Color.GREEN); // цвет надписи
		JButton button3 = new JButton("button text3");
		Color backGround1 = button1.getBackground(); // вытащили цвет б.граунда в переменную
		button3.setBackground(backGround1);
		
		Cursor cursor3 = new Cursor(Cursor.MOVE_CURSOR); // создаем инстанс курсора с константой
		button3.setCursor(cursor3); // сетим курсор на кнопку
	
		
		myFrame.add(button1);
		myFrame.add(button2);
		myFrame.add(button3);		
		

	}

}
