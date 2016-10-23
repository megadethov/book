package gui.lesson_04_Listeners_Events;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mega on 14.09.2016.
 */
public class TestGUI {

    private MyJFrame frame;

    private JPanel panelInput;
    private JPanel panelAction;
    private JPanel panelResult;

    private JButton butAdd;
    private JButton butSubtract;
    private JButton butMultiply;
    private JButton butDivide;
    private JButton butResult;

    private JLabel labelNum1;
    private JLabel labelNum2;
    private JLabel labelResult;

    private JTextField textFieldNum1;
    private JTextField textFieldNum2;
    private JTextField textFieldRes;

    public static void main(String[] args) {
// установить скин ВСЕГДА В НАЧАЛЕ
        try {
            UIManager.setLookAndFeel(new AcrylLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
// создать инстанс, чтобы юзать из psvm не статик методы и поля
        TestGUI test = new TestGUI();


        // создать компоненты
        test.createPanels();
        test.createLabels();
        test.createTextFields();
        test.createButtons();

        // размещение компонентов на панелях
        test.panelInput.add(test.labelNum1);
        test.panelInput.add(test.textFieldNum1);
        test.panelInput.add(test.labelNum2);
        test.panelInput.add(test.textFieldNum2);

        test.panelAction.add(test.butAdd);
        test.panelAction.add(test.butSubtract);
        test.panelAction.add(test.butMultiply);
        test.panelAction.add(test.butDivide);

        test.panelResult.add(test.labelResult);
        test.panelResult.add(test.textFieldRes);
        test.panelResult.add(test.butResult);

        // создать frame
        test.createFrame();
        // установоть layout на frame
        test.frame.setLayout(new GridLayout(3, 0, 1, 1));

        // размещение панелей на фрейме
        test.frame.getContentPane().add(test.panelInput);
        test.frame.getContentPane().add(test.panelAction);
        test.frame.getContentPane().add(test.panelResult);

        // отобразить фрейм ВСЕГДА В КОНЦЕ
        test.frame.setVisible(true);

    }

    public void createFrame() {
        frame = new MyJFrame("frame", 400, 150);
    }

    public void createButtons() {
        butAdd = new JButton("+");
        butAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        butSubtract = new JButton("-");
        butMultiply = new JButton("x");
        butDivide = new JButton("/");
        butResult = new JButton("=");
    }

    public void createLabels() {
        labelNum1 = new JLabel("Number1");
        labelNum2 = new JLabel("Number2");
        labelResult = new JLabel("Result");
    }

    public void createTextFields() {
        textFieldNum1 = new JTextField(10);
        textFieldNum2 = new JTextField(10);
        textFieldRes = new JTextField(10);
        textFieldRes.setEditable(false);
        textFieldRes.setFocusable(false);

        Font font = new Font(Font.SERIF, Font.ITALIC, 12);
        textFieldNum1.setFont(font);
        textFieldNum1.setForeground(Color.RED);
    }

    public void createPanels() {
        panelInput = new JPanel(new FlowLayout());
        panelInput.setBorder(BorderFactory.createEtchedBorder());
        panelAction = new JPanel(new FlowLayout());
        panelAction.setBorder(BorderFactory.createEtchedBorder());
        panelResult = new JPanel(new FlowLayout());
        panelResult.setBorder(BorderFactory.createEtchedBorder());
    }

}
