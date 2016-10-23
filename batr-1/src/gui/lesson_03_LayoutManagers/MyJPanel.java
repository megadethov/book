package gui.lesson_03_LayoutManagers;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mega on 13.09.2016.
 */
public class MyJPanel extends JPanel {

    public MyJPanel(String name, int width, int height) {
        super.setName(name);
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
    }

    public MyJPanel(String name, int width, int height, Component component) {
        this(name, width, height);
        super.add(component);
    }

    public MyJPanel(String name, int width, int height, LayoutManager layout) {
        this(name, width, height);
        super.setLayout(layout);
    }

    public MyJPanel(String name, int width, int height, Component component, LayoutManager layout) {
        this(name, width, height, component);
        super.setLayout(layout);
    }
}
