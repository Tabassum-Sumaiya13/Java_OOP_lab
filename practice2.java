//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//
//public class practice2 implements WindowListener, ActionListener {
//    Frame f;
//    Panel p;
//    TextField t1=new TextField(30);
//    Button b1=new Button("Click");
//    Button b2=new Button("Exit");
//    Label l=new Label("hello");
//    public practice2() {
//        f = new Frame("My Frame");
//        f.setSize(200, 300);
//        f.setLayout(new FlowLayout());
//        f.setBackground(Color.blue);
//        f.addWindowListener(this);
//        f.add(t1);
//        f.add(b1);
//        f.add(b2);
//        f.add(l);
//        b1.setSize(10,20);
//        b1.setBackground(Color.red);
//        b2.setBackground(Color.lightGray);
//        b2.setSize(10,20);
//        t1.setBackground(Color.cyan);
//        l.setSize(100,20);
//        l.setBackground(Color.darkGray);
//        f.setVisible(true);
//    }
//    @Override
//    public void windowClosing(WindowEvent e) {
//        System.exit(0);
//    }
//   @Override
//    public void windowDeactivated(WindowEvent e) {
//
//    }      public static void main (String[]args){
//            practice2 p = new practice2();
//        }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//            while(e.getSource()!=b2){
//                t1.setText("hi");       }
