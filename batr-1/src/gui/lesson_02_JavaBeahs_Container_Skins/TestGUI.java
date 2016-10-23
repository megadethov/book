package gui.lesson_02_JavaBeahs_Container_Skins;

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
            UIManager.setLookAndFeel(new MetalLookAndFeel()); // вид определяет встроенный скин MetalLookAndFeel
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // вид определяет ОС
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel"); // вид определяет Java скин
        } /*catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }*/ catch (UnsupportedLookAndFeelException e) {
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
