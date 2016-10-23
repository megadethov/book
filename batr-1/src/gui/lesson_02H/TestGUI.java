package gui.lesson_02H;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

/**
 * Created by mega on 13.09.2016.
 */
public class TestGUI {
    public static void main(String[] args) {

        // Задать скин окна
        try {
            UIManager.setLookAndFeel(new AcrylLookAndFeel()); // вид определяет встроенный скин MetalLookAndFeel

        }  catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame.setDefaultLookAndFeelDecorated(true); // false - скины применяются только к внутр. компонентам окна



        MyJButton button = new MyJButton("start");
        MyJPanel label = new MyJPanel("panel-01", 200, 200, button, new FlowLayout());
        label.setBorder(BorderFactory.createEtchedBorder());
        MyJFrame frame = new MyJFrame("frame-01", 300, 250, label);

        frame.setIconImage(new ImageIcon("d:\\java\\book\\batr\\icon.png").getImage()); // иконка в меню окна

    }
}
