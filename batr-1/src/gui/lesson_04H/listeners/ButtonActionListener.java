package gui.lesson_04H.listeners;

import gui.lesson_04H.calc.CalcOperations;
import gui.lesson_04H.gui.MyJTextField;

import javax.swing.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mega on 14.09.2016.
 */
public class ButtonActionListener implements ActionListener {

    private MyJTextField jTxtNum1;
    private MyJTextField jTxtNum2;
    private MyJTextField jTxtResult;

    public ButtonActionListener(MyJTextField jTxtNum1, MyJTextField jTxtNum2, MyJTextField jTxtResult) {
        this.jTxtNum1 = jTxtNum1;
        this.jTxtNum2 = jTxtNum2;
        this.jTxtResult = jTxtResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!(e.getSource() instanceof JButton)) {
            return;
        }
        JButton btn = (JButton) e.getSource();

        final double a = Double.parseDouble(jTxtNum1.getText());
        final double b = Double.parseDouble(jTxtNum2.getText());

        if (btn.getActionCommand().equals("+")) {
            jTxtResult.setText(String.valueOf(CalcOperations.add(a, b)));
        } else if (btn.getActionCommand().equals("-")) {
            jTxtResult.setText(String.valueOf(CalcOperations.subtract(a, b)));
        } else if (btn.getActionCommand().equals("x")) {
            jTxtResult.setText(String.valueOf(CalcOperations.multiple(a, b)));
        } else if (btn.getActionCommand().equals("/")) {
            jTxtResult.setText(String.valueOf(CalcOperations.divide(a, b)));
        }

    }
}
