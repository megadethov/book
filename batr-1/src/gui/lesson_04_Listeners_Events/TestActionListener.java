package gui.lesson_04_Listeners_Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mega on 14.09.2016.
 */
public class TestActionListener {
    public static void main(String[] args) {

        MyJFrame testFrame = new MyJFrame("test", 300, 300);
        JPanel panelTest = new JPanel(new FlowLayout());

        JButton button = new JButton("button 1");

            // вариант с анонимным классом
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showConfirmDialog(panelTest, "Hello");
//                System.out.println(e.getSource()); // полная инфа о вызвавшем ивент объекте
                if (e.getSource() instanceof JButton) {
                    JButton tempButton = (JButton) e.getSource();
                    JOptionPane.showMessageDialog(panelTest, "pressed: " + tempButton.getText());
                }
            }
        });

        // вариант с local nested class
//        class MyActionListener implements ActionListener {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("TEST");
//            }
//        }
//        button.addActionListener(new MyActionListener());



        panelTest.add(button);
        testFrame.getContentPane().add(panelTest);

        testFrame.setLayout(new FlowLayout());
        testFrame.setVisible(true);


    }


}
