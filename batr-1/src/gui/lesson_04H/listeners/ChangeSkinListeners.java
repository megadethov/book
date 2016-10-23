package gui.lesson_04H.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mega on 14.09.2016.
 */
public class ChangeSkinListeners implements ActionListener {
    private LookAndFeel laf;
    private JFrame frame;

    public ChangeSkinListeners(JFrame frame, LookAndFeel laf) {
        this.frame = frame;
        this.laf = laf;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            UIManager.setLookAndFeel(laf);
        } catch (UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }


        SwingUtilities.updateComponentTreeUI(frame);

    }

}
