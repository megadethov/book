package gui.lesson_01_CreateFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mega on 13.09.2016.
 */
public class TestGui {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Frame test");
        frame.setSize(300, 300);
        frame.setVisible(true);

        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);

//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the same
        frame.setDefaultCloseOperation(3); // the same

        JButton button = new JButton("Test button");
        frame.add(button);



    }
}
