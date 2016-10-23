package gui.lesson_04H.listeners;

import gui.lesson_04H.gui.MyJTextField;
import gui.lesson_04H.gui.TestGUI;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by mega on 14.09.2016.
 */
public class TextFieldFocusListener implements FocusListener {

    private MyJTextField field;

    public TextFieldFocusListener(MyJTextField field) {
        this.field = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(TestGUI.INPUT_NUM)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(TestGUI.INPUT_NUM);
            field.setForeground(Color.GRAY);
        }
    }
}
