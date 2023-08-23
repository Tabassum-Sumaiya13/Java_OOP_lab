package AWTtest;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SwapGuiPractice1 implements WindowListener, ActionListener {
    Frame frame;
    Panel panel;
    TextField tf1;
    TextField tf2;
    Label l1;
    Button b1;
    public SwapGuiPractice1() {
        frame=new Frame("Swap");
        
        tf1=new TextField(10);
        tf2=new TextField(10);
        b1=new Button("Swap");
        l1=new Label("done");
    }
    public void LaunchFrame(){
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setSize(600,500);
        tf1.setSize(100,200);
        tf2.setSize(100,200);
        b1.setSize(100,200);
        l1.setSize(100,200);
        frame.addWindowListener(this);
        b1.addActionListener(this);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(b1);
        frame.add(l1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String temp=tf1.getText();
            tf1.setText(tf2.getText());
            tf2.setText(temp);
        }


    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
class test {
    public static void main(String[] args) {
        SwapGuiPractice1 test=new SwapGuiPractice1();
        test.LaunchFrame();

    }
}