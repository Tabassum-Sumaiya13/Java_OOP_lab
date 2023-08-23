package AWTtest;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class practice1 implements WindowListener, ActionListener {

   Frame frame;
   Panel panel;
   Image im;

   public void actionPerformed(ActionEvent e){

   }
   public void windowClosed(WindowEvent we){}
   public void windowClosing(WindowEvent we){
       System.exit(0);
   }
   public void windowActivated(WindowEvent we){}
   public void windowDeactivated(WindowEvent we){}
   public void windowDeiconified(WindowEvent we){}
   public void windowIconified(WindowEvent we){}
   public void windowOpened(WindowEvent we){}

}
