package cse22504;
import java.awt.*;
import java.awt.event.*;

public class MenuExample extends WindowAdapter{
	Frame f;
	MenuExample(){
		f = new Frame("BVRIT Hyderabad College Of Engineering For Women");
		MenuBar mb = new MenuBar();
		Menu menu = new Menu("Departments");
		Menu submenu1 = new Menu("CSE");
		Menu submenu2 = new Menu("IT");
		Menu submenu3 = new Menu("ECE");
		MenuItem i1 = new MenuItem("EEE");
		MenuItem i2 = new MenuItem("CSM");
		MenuItem i3 = new MenuItem("CSE-A");
		MenuItem i4 = new MenuItem("CSE-B");
		MenuItem i5 = new MenuItem("CSE-C");
		MenuItem i6 = new MenuItem("IT-A");
		MenuItem i7 = new MenuItem("IT-B");
		MenuItem i8 = new MenuItem("ECE-A");
		MenuItem i9 = new MenuItem("ECE-B");
		menu.add(i1);
		menu.add(i2);
		submenu1.add(i3);
		submenu1.add(i4);
		submenu1.add(i5);
		submenu2.add(i6);
		submenu2.add(i7);
		submenu3.add(i8);
		submenu3.add(i9);
		menu.add(submenu1);
		menu.add(submenu2);
		menu.add(submenu3);
		mb.add(menu);
		f.addWindowListener(this);
		f.setMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e) {
        f.dispose();
    }

	public static void main(String args[])
	{
		new MenuExample();
	}
}
