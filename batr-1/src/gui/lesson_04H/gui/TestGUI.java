package gui.lesson_04H.gui;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import gui.lesson_04H.listeners.ButtonActionListener;
import gui.lesson_04H.listeners.ChangeSkinListeners;
import gui.lesson_04H.listeners.TextFieldFocusListener;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

/**
 * Created by mega on 14.09.2016.
 */
public class TestGUI {

    public static final String INPUT_NUM = "input number";

    private MyJButton btnAdd;
    private MyJButton btnSubtract;
    private MyJButton btnDivide;
    private MyJButton btnMultiply;
    private MyJButton btnDefaultSkin;
    private MyJButton btnChangeSkin;

    private JLabel labelNum1;
    private JLabel labelNum2;
    private JLabel labelResult;

    private MyJTextField jTxtNum1;
    private MyJTextField jTxtNum2;
    private MyJTextField jTxtResult;

    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;

    private MyJFrame frame;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new AeroLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame.setDefaultLookAndFeelDecorated(true);

        TestGUI testGUI = new TestGUI();

        testGUI.createLabels();
        testGUI.createTextFields();
        testGUI.createButtons();
        testGUI.createPanels();
        testGUI.createFrame();


    } // end main()

    private void createFrame() {
        frame = new MyJFrame("Calculator", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430, 200));

        frame.setResizable(false);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);

        addChangeSkinListeners();

        frame.setVisible(true);
    }

    private void createPanels() {
        panel1 = new MyJPanel("panel1", 100, 100);
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel2 = new MyJPanel("panel2", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel3 = new MyJPanel("panel3", 100, 100);
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1.add(labelNum1);
        panel1.add(jTxtNum1);
        panel1.add(labelNum2);
        panel1.add(jTxtNum2);

        panel2.add(btnAdd);
        panel2.add(btnSubtract);
        panel2.add(btnMultiply);
        panel2.add(btnDivide);

        panel3.add(labelResult);
        panel3.add(jTxtResult);
        panel3.add(btnChangeSkin);
        panel3.add(btnDefaultSkin);
    }

    private void createButtons() {
        btnAdd = new MyJButton("+");
        btnSubtract = new MyJButton("-");
        btnDivide = new MyJButton("/");
        btnMultiply = new MyJButton("x");
        btnChangeSkin = new MyJButton("Skin1");
        btnDefaultSkin = new MyJButton("Skin2");

        addButtonListeners();
    }

    private void createTextFields() {
        jTxtNum1 = new MyJTextField(INPUT_NUM, 10);
        jTxtNum2 = new MyJTextField(INPUT_NUM, 10);

        jTxtResult = new MyJTextField(15, Color.RED);
        jTxtResult.setEditable(false);
        jTxtResult.setFocusable(false);

        addTextFieldListeners();
    }

    private void createLabels() {
        labelNum1 = new JLabel("Number 1");
        labelNum2 = new JLabel("Number 2");
        labelResult = new JLabel("Result");
    }

    private void addButtonListeners() {
        ButtonActionListener butListener = new ButtonActionListener(jTxtNum1, jTxtNum2, jTxtResult);
        btnAdd.addActionListener(butListener);
        btnSubtract.addActionListener(butListener);
        btnMultiply.addActionListener(butListener);
        btnDivide.addActionListener(butListener);

    }


    private void addTextFieldListeners() {
        jTxtNum1.addFocusListener(new TextFieldFocusListener(jTxtNum1));
        jTxtNum2.addFocusListener(new TextFieldFocusListener(jTxtNum2));
    }

    private void addChangeSkinListeners() {
        btnChangeSkin.addActionListener(new ChangeSkinListeners(frame, new AcrylLookAndFeel()));
        btnDefaultSkin.addActionListener(new ChangeSkinListeners(frame, new MetalLookAndFeel()));
    }
}
