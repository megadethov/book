package gui.lesson_04_Listeners_Events;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mega on 14.09.2016.
 */
public class MyJFrame extends JFrame {
    MyJFrame(){};
    MyJFrame(String name, int width, int height) {
        super(name);
        super.setSize(width, height);
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        super.setLocationRelativeTo(null);
        super.setMinimumSize(new Dimension(400, 180));
        super.setResizable(false);
    }
}
