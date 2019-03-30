import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Reservation extends JPanel{
	ReservationListener aLis;
	MyProject project;
	
	JButton btn1;
	JButton btn2;	
	JLabel lbl1;
	JLabel lbl2;
	JLabel lbl3;
	JLabel lbl4;
	JLabel lbl5;
	JLabel lbl6;
	JLabel lbl7;
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	JTextField tf4;
	JTextField tf5;
	JTextField tf6;
	JTextField tf7;
	public Reservation(){
		
	}
	public Reservation(MyProject project){
	this.project = project;
	this.setLayout(null);
	this.setBackground(new Color(255,55,25));
	
	 this.btn1 = new JButton("Get Bus Details");
	 this.btn2 = new JButton("Reset");
	 	
	 this.lbl1 = new JLabel("Source :");
	 this.lbl2 = new JLabel("Destination :");
	 this.lbl3 = new JLabel("Time:");
	 //this.lbl4 = new JLabel("DD");
	// this.lbl5 = new JLabel("/MM");
	// this.lbl6 = new JLabel("/YY");
	// this.lbl7 = new JLabel("Bus Id :");
 		
 	 this.tf1 = new JTextField();
 	 this.tf2 = new JTextField();
	 this.tf3 = new JTextField();
	 //this.tf4 = new JTextField();
	 //this.tf5 = new JTextField();
	// this.tf6 = new JTextField();
	// this.tf7 = new JTextField();
 		
		
	this.lbl1.setBounds(10,30,100,30);
	this.lbl2.setBounds(500,30,100,30);
	this.tf1.setBounds(120,30,100,30);
	this.tf2.setBounds(600,30,100,30);
	this.lbl3.setBounds(80,150,100,30);
	//this.lbl4.setBounds(150,150,100,30);
	this.tf3.setBounds(170,155,30,20);
	//this.lbl5.setBounds(200,155,30,20);
	//this.tf4.setBounds(225,155,30,20);
	//this.lbl6.setBounds(255,155,30,20);
	//this.tf5.setBounds(275,155,30,20);
	this.btn1.setBounds(320,155,150,20);
	this.btn2.setBounds(500,155,90,20);
//	this.lbl7.setBounds(350,200,90,20);
	
	
		this.add(lbl1);
		this.add(lbl2);
		this.add(tf1);
		this.add(tf2);
		this.add(lbl3);
		//this.add(lbl4);
		this.add(tf3);
		//this.add(lbl5);
		//this.add(tf4);
		//this.add(lbl6);
		//this.add(tf5);
		this.add(btn1);
		this.add(btn2);
		//this.add(lbl7);
					ReservationListener aLis = new ReservationListener(project);
			btn1.addActionListener(aLis);
		
	testAnonimusclass();
	}
	public void testAnonimusclass(){
		this.btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
			
		this.btn1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				try	
				{			
				Class.forName("com.mysql.jdbc.Driver");				
				Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/busmanagement","root",""); 			
				//JOptionPane.showMessageDialog(null, "success");
				
				 Statement st = connection.createStatement();	

			String query = "insert into reserve values(?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, tf1.getText());
			statement.setString(2, tf2.getText());
			statement.setString(3, tf3.getText());			
			statement.execute();
			//dispose();
			

						
				}
		
				catch(Exception e1)
				{
					System.out.println(e1);
				}	
			}
		});

	}
}
		
	