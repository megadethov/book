package gui.lesson_04H.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mega on 14.09.2016.
 */
public class MyJButton extends JButton {

    MyJButton(String title) {
        super.setText(title);
    }

    MyJButton(String title, int width, int height) {
        this(title);
        super.setSize(width, height);

    }
}
