package gui.lesson_03_LayoutManagers;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mega on 13.09.2016.
 */
public class TestLayout1_BorderLayout {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new AcrylLookAndFeel()); // вид определяет встроенный скин MetalLookAndFeel

        }  catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        MyJFrame frame = new MyJFrame("Calculator", 500, 300);

//        MyJPanel panel = new MyJPanel("panel", 500, 300, new FlowLayout());
        MyJPanel panel = new MyJPanel("panel", 500, 300, new BorderLayout());

        JButton button0 = new JButton("b0");
        button0.setPreferredSize(new Dimension(100, 100)); // ограничение минимального размера кнопки
        JButton button1 = new JButton("b1");
        JButton button2 = new JButton("b2");
        JButton button3 = new JButton("b3");
        JButton button4 = new JButton("b4");
        JButton button5 = new JButton("b5");
        JButton button6 = new JButton("b6");
        JButton button7 = new JButton("b7");
        JButton button8 = new JButton("b8");
        JButton button9 = new JButton("b9");
        panel.add(button0, BorderLayout.NORTH);
        panel.add(button1, BorderLayout.CENTER);
        panel.add(button2, BorderLayout.EAST);
        panel.add(button3, BorderLayout.WEST);
        panel.add(button4, BorderLayout.SOUTH);
//        panel.add(button5, BorderLayout.CENTER);
//        panel.add(button6, BorderLayout.CENTER);
//        panel.add(button7, BorderLayout.CENTER);
//        panel.add(button8, BorderLayout.CENTER);
//        panel.add(button9, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setIconImage(new ImageIcon("d:\\java\\book\\batr\\icon.png").getImage());
        JFrame.setDefaultLookAndFeelDecorated(true);


    }
}
