package gui.lesson_04H.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mega on 14.09.2016.
 */
public class MyJTextField extends JTextField {

    public MyJTextField(String text, int columns) {
        this(columns);
        super.setText(text);
    }

    public MyJTextField(int columns) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }

    public MyJTextField(int columns, Color textColor) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
}
