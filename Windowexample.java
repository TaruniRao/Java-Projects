package cse_225g6;
import java.awt.*;
import java.awt.event.*;



public class Windowexample extends WindowAdapter {
	private Frame f;
	
	public Windowexample() {
	
	    f = new Frame("Hello Frame");
	
	    f.setSize(1400, 1400);
	
	    f.setBounds(30, 60, 1000, 1400); // Corrected the size values
	
	    f.setLayout(null);
	
	    f.setVisible(true);
	
	    f.addWindowListener(this);
	
	    f.setBackground(Color.GRAY);
	
	    Label l = new Label("STUDENT REGISTRATION FORM");
	
	    f.add(l);
	
	    l.setSize(100,100);
	
	    l.setBounds(300,30,300,30);
	
	    l.setVisible(true);
	
	    Label l1 = new Label("NAME:");
	
	    f.add(l1);
	
	    l1.setSize(150,30);
	
	    l1.setBounds(50,60,150,30);
	
	    l1.setVisible(true);
	
	    TextField t1 = new TextField();
	
	    f.add(t1);
	
	    t1.setSize(100,100);
	
	    t1.setBounds(300,60,300,30);
	
	    t1.setVisible(true);
	
	    Label l2 = new Label("FATHER NAME:");
	
	    f.add(l2);
	
	    l2.setSize(100,100);
	
	    l2.setBounds(50,100,150,30);
	
	    l2.setVisible(true);
	
	    TextField t2 = new TextField();
	
	    f.add(t2);
	
	    t2.setSize(100,100);
	
	    t2.setBounds(300,100,300,30);
	
	    t2.setVisible(true);
	
	    Label l3 = new Label("MOTHER NAME:");
	
	    f.add(l3);
	
	    l3.setSize(100,100);
	
	    l3.setBounds(50,150,150,30);
	
	    l3.setVisible(true);
	
	    TextField t3 = new TextField();
	
	    f.add(t3);
	
	    t3.setSize(100,100);
	
	    t3.setBounds(300,150,300,30);
	
	    t3.setVisible(true);
	
	    Label l4 = new Label("PHONE NUMBER:");
	
	    f.add(l4);
	
	    l4.setSize(100,100);
	
	    l4.setBounds(50,200,150,30);
	
	    l4.setVisible(true);
	
	    TextField t4 = new TextField();
	
	    f.add(t4);
	
	    t4.setSize(100,100);
	
	    t4.setBounds(300,200,300,30);
	
	    t4.setVisible(true);
	
	    Label l5 = new Label("email:");
	
	    f.add(l5);
	
	    l5.setSize(100,100);
	
	    l5.setBounds(50,250,150,30);
	
	    l5.setVisible(true);
	
	    TextField t5 = new TextField();
	
	    f.add(t5);
	
	    t5.setSize(100,100);
	
	    t5.setBounds(300,250,300,30);
	
	    t5.setVisible(true);
	
	    Label l6 = new Label("GENDER:");
	
	    f.add(l6);
	
	    l6.setSize(100,100);
	
	    l6.setBounds(50,300,150,30);
	
	    l6.setVisible(true);
	
	    TextField t6 = new TextField();
	
	    f.add(t6);
	
	    t6.setSize(100,100);
	
	    t6.setBounds(300,300,300,30);
	
	    t6.setVisible(true);
	
	    Label l7 = new Label("DOB:");
	
	    f.add(l7);
	
	    l7.setSize(100,100);
	
	    l7.setBounds(50,350,150,30);
	
	    l7.setVisible(true);
	
	    TextField t7 = new TextField();
	
	    f.add(t7);
	
	    t7.setSize(100,100);
	
	    t7.setBounds(300,350,300,30);
	
	    t7.setVisible(true);
	
	    Label l10 = new Label("-");
	
	    f.add(l10);
	
	    l10.setSize(100,100);
	
	    l10.setBounds(320,350,10,30);
	
	    l10.setVisible(true);
	
	    Label l8 = new Label("DEPARTMENT:");
	
	    f.add(l8);
	
	    l8.setSize(100,100);
	
	    l8.setBounds(50,400,150,30);
	
	    l8.setVisible(true);
	
	    Checkbox c1 = new Checkbox("CSE");
	    
	    Checkbox c2 = new Checkbox("IT");
	    
	    Checkbox c3 = new Checkbox("ECE");
	    
	    Checkbox c4 = new Checkbox("CSM");
	    
	    Checkbox c5 = new Checkbox("EEE");
	    
	    f.add(c1);
	    f.add(c2);
	    f.add(c3);
	    f.add(c4);
	    f.add(c5);
	    
	    c1.setBounds(300,400,100,30);
	    c2.setBounds(400,400,100,30);
	    c3.setBounds(500,400,100,30);
	    c4.setBounds(600,400,100,30);
	    c5.setBounds(700,400,100,30);
	    
	
	    Label l9 = new Label("COURSE:");
	
	    f.add(l9);
	
	    l9.setSize(100,100);
	
	    l9.setBounds(50,450,150,30);
	
	    l9.setVisible(true);
	
	    Button b1 = new Button("SUBMIT");
	
	    f.add(b1);
	
	    b1.setSize(100,100);
	
	    b1.setBounds(50,650,100,30);
	
	    b1.setVisible(true);
	
	    Button b2 = new Button("RESET");

        f.add(b2);

        b2.setSize(100,100);

        b2.setBounds(160,650,100,30);

        b2.setVisible(true);

	    }

	    public void windowClosing(WindowEvent e) {

	        f.dispose();

	    }
	    
	    public static void main(String[] args) {

	        new Windowexample();

	    }
}
