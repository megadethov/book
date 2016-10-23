package gui.lesson_02_JavaBeahs_Container_Skins;

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
