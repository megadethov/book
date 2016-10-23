package gui.lesson_03_LayoutManagers;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;

import javax.swing.*;

/**
 * Created by mega on 13.09.2016.
 */
public class MyJFrame extends JFrame {
    MyJFrame(String title, int width, int height) {
        super(title);
        super.setSize(width, height);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setLocationRelativeTo(null);
    }

}
