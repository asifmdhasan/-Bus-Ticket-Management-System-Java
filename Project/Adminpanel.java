//package Project.App;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Adminpanel extends JFrame{
	
	Busmanagment mange;
	JTabbedPane  tab;
	//Admin a1;
	
		public Adminpanel(){
		this.setTitle("Admin panel");
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		 
		//this.a1 = new Admin("14-24","rocket","12:00");
		this.mange = new Busmanagment(this);
		this.tab = new JTabbedPane();
		this.tab.addTab("Bus Mangement", this.mange);
		
		this.add(tab);

		}
}