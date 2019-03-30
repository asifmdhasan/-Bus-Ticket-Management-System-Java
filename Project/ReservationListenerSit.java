import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReservationListenerSit implements ActionListener{
	MyProject project;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11;
	JTextField txt1, txt2, txt3,txt4,txt5,txt6,txt7,txt9,txt10,txt11;
	JButton btn1,btn2,btn3;
	public ReservationListenerSit(){
		
	}
	public ReservationListenerSit(MyProject project){
		this.project = project;
	}
		public void actionPerformed(ActionEvent e){
		JFrame frame = new JFrame();
		frame.setTitle("LUXURY BUS SERVICE");
		frame.setSize(500,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	btn1 = new JButton("Print Ticket");
	btn2 = new JButton("Cancel");
	btn3= new JButton("Close");
		
	btn1.setBounds(20,335,100,20);
	btn2.setBounds(185,335,80,20);
	btn3.setBounds(330,335,70,20);
		


		
	lbl1	= new JLabel("Source Station:");
	lbl2 	= new JLabel("Destination Station:");
	lbl3 	= new JLabel("Date Of Journey:");
	lbl4	= new JLabel("Bus Timing:");
	lbl5	= new JLabel("Booked by Agent:");
	lbl6	= new JLabel("Cost of Ticket:");
	lbl7	= new JLabel("Bus Id:");
	lbl8   = new JLabel("Passanger Information");
	lbl9	= new JLabel("Seat NO:");
	lbl10	= new JLabel("Passanger Name:");
	lbl11   = new JLabel("Passanger MobileNO:");
		
		
	txt1 	= new JTextField();
	txt2	= new JTextField();
	txt3 	= new JTextField();	
	txt4 	= new JTextField();
	txt5 	= new JTextField();
	txt6 	= new JTextField();
	txt7 	= new JTextField();
	txt9	= new JTextField();
	txt10 	= new JTextField();
	txt11	= new JTextField();
		
	frame.setLayout(null);
		
	lbl1.setBounds(15, 5, 120, 20);
	txt1.setBounds(150, 5, 150, 20);
		
	lbl2.setBounds(15, 35, 130, 20);
	txt2.setBounds(150, 35, 150, 20);
		
	lbl3.setBounds(15, 65, 120, 20);
	txt3.setBounds(150, 65, 150, 20);
		
	lbl4.setBounds(15, 95, 120, 20);
	txt4.setBounds(150, 95, 150, 20);
		
	lbl5.setBounds(15, 125, 130, 20);
	txt5.setBounds(150, 125, 150, 20);
		
	lbl6.setBounds(15, 155, 120, 20);
	txt6.setBounds(150, 155, 150, 20);
		
	lbl7.setBounds(15, 185, 130, 20);
	txt7.setBounds(150, 185, 150, 20);
		
	lbl8.setBounds(155, 215, 150, 20);
		
	lbl9.setBounds(15, 245, 130, 20);
	txt9.setBounds(150, 245, 150, 20);
		
	lbl10.setBounds(15, 275, 120, 20);
	txt6.setBounds(150, 275, 150, 20);
		
	lbl11.setBounds(15, 305, 130, 20);
	txt11.setBounds(150, 305, 150, 20);

		
		
		
		frame.add(lbl1); 
		frame.add(txt1);
		
		frame.add(lbl2); 
		frame.add(txt2);
		
		frame.add(lbl3); 
		frame.add(txt3);
		
		frame.add(lbl4); 
		frame.add(txt4);
		
		frame.add(lbl5); 
		frame.add(txt5);
		
		frame.add(lbl6); 
		frame.add(txt6);
		
		frame.add(lbl7); 
		frame.add(txt7);
		
		frame.add(lbl8); 
		
		frame.add(lbl9); 
		frame.add(txt9);
		
		frame.add(lbl10); 
		frame.add(txt10);
		
		frame.add(lbl11); 
		frame.add(txt11);
		frame.add(btn1); 
		frame.add(btn2); 
		frame.add(btn3); 

		testAnnonymousClass();
		}
		
		public void testAnnonymousClass(){
			
		 this.btn1.addActionListener(new ActionListener() {
			
		 public void actionPerformed(ActionEvent e) {
			 addbtn1();
		 }
		 });
		
		  this.btn2.addActionListener(new ActionListener() {
			
		  public void actionPerformed(ActionEvent e) {
			  System.exit(0);
		  }
		 });
		 }

	    public void addbtn1(){
		JFrame frame2 = new JFrame();
		frame2.setTitle("Information");
		frame2.setSize(200,200);
		frame2.setLocationRelativeTo(null);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//lbl = new JLabel("total cost: 500");
	//	lbl.setBounds(50,50,80,50);
		//panel.add(lbl);
		
	//	btn1 = new JButton("ok");
		//btn1.setBounds(110,100,50,30);
		//panel.add(btn1);
		//frame2.add(panel);
		
		//ReservationListenerInformation aLis = new ReservationListenerInformation(project);
	   // this.btn1.addActionListener(aLis);
		  }	
}