package gui.lesson_01H;

import java.awt.*;

/**
 * Created by mega on 13.09.2016.
 */
public class TestGUI {
    public static void main(String[] args) {

        MyJButton button = new MyJButton("start");
        MyJPanel label = new MyJPanel("panel-01", 200, 200, button, new FlowLayout());
        label.setBackground(Color.RED);
        MyJFrame frame = new MyJFrame("frame-01", 300, 250, label);

    }
}
