import javax.management.StringValueExp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Converter implements WindowListener, ActionListener {
    Frame frame;
    Panel panel;
    Label l1;
    Label l2;
    Button b1;
    TextField t1,t2;
    public Converter() {
        frame = new Frame();
        panel = new Panel();
        l1=new Label("Enter");
        l2=new Label("Inch");
        b1=new Button("Convert");
        t1=new TextField(30);
        t2=new TextField(30);

    }
    public void LaunchFrame()
    {
        frame.setTitle("Converter");
        frame.setSize(100,200);
        frame.add(panel);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.addWindowListener(this);
        panel.add(l1);
        panel.add(t1);
        panel.add(b1);
        panel.add(l2);
        panel.add(t2);


        b1.addActionListener(this);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            double a=Double.parseDouble(t1.getText());
            a=a*12;
            t2.setText(String.valueOf(a));
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

    public static void main(String[] args) {
        Converter c=new Converter();
        c.LaunchFrame();
    }
}
