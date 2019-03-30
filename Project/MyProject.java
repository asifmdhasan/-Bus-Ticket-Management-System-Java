import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyProject extends JFrame{
	
	Reservation reserve;
	JTabbedPane tab;
	
		public MyProject(){
		this.setTitle("My Project");
		this.setSize(800,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.reserve = new Reservation(this);
		this.tab = new JTabbedPane();
		this.tab.addTab("Reserve Sit", this.reserve);
		
		this.add(tab);
			
			
		}
}