package gui.lesson_03_LayoutManagers;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mega on 13.09.2016.
 */
// Layout = null. Все компоненты прописываютсявручную
public class TestLayout4_AbsolutPos {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new AcrylLookAndFeel()); // вид определяет встроенный скин MetalLookAndFeel

        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        MyJFrame frame = new MyJFrame("Calculator", 500, 300);

        MyJPanel panel = new MyJPanel("panel", 500, 300);
        panel.setLayout(null); // layout отключены

        JButton button0 = new JButton("b0");
        button0.setBounds(new Rectangle(5, 5, 50, 50));
        JButton button1 = new JButton("b1");
        button1.setBounds(new Rectangle(60, 5, 50, 50));
        JButton button2 = new JButton("b2");
        JButton button3 = new JButton("b3");
        JButton button4 = new JButton("b4");
        JButton button5 = new JButton("b5");
        JButton button6 = new JButton("b6");
        JButton button7 = new JButton("b7");
        JButton button8 = new JButton("b8");
        JButton button9 = new JButton("b9");
        panel.add(button0);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);

        frame.getContentPane().add(panel);
        frame.setIconImage(new ImageIcon("d:\\java\\book\\batr\\icon.png").getImage());
        JFrame.setDefaultLookAndFeelDecorated(true);


    }
}
