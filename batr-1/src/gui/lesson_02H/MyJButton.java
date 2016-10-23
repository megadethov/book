package gui.lesson_02H;

import javax.swing.*;

/**
 * Created by mega on 13.09.2016.
 */
public class MyJButton extends JButton {

   public MyJButton(String title){
       super(title);
   }

    public MyJButton(String title, int width, int height){
        this(title);
        super.setSize(width, height);
    }
}
