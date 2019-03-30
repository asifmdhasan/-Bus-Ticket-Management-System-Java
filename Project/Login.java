//package Project.App;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame{
	JTextField tf1;
	JTextField tf2;
	JButton btn1;
	JLabel lbl1;
	JLabel lbl2;
	JButton btn2;	
	
	public Login(){	
	this.dispose();
		this.setTitle("Login");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setLocationRelativeTo(null);
	
		JPanel panel = new JPanel();		
		panel.setLayout(null);
		btn1 = new JButton("Login");
		btn2 = new JButton("Register");
		lbl1 = new JLabel("UserName");
		lbl2 = new JLabel("Password");
		tf1 = new JTextField();
		tf2 = new JTextField();

		lbl1.setBounds(10,75,100,30);
		lbl2.setBounds(10,110,100,30);
		tf1.setBounds(80,85,100,20);
		tf2.setBounds(80,120,100,20);
		btn1.setBounds(150,150,70,20);
		btn2.setBounds(150,190,100,20);
		panel.setBounds(0,0,400,500);
		panel.setBackground(Color.BLUE);
		btn1.setBackground(Color.WHITE);
		
		panel.add(lbl1);
		panel.add(tf1);
		panel.add(lbl2);
		panel.add(tf2);
	 	panel.add(btn1);
		panel.add(btn2);		
		this.add(panel);
		this.dispose();
		
		btn1.addActionListener( new ActionListener()
		{
		
			public void actionPerformed(ActionEvent e)
			{

				try	
				{				 
				Class.forName("com.mysql.jdbc.Driver");				
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/busmanagement","root","");  
				Statement st = con.createStatement();				
					ResultSet rs = st.executeQuery("Select * from user");
					String username=null;
					String password=null;
					while(rs.next())
					{
						username=rs.getString("username");
						password=rs.getString("password");
						if(tf1.getText().equals(username) && tf2.getText().equals(password))
						{
							MyProject project = new MyProject();		
						}
						
					}
					
				
				}
		
				catch(Exception e1)
				{
					System.out.println(e1);
				}	
  				if(e.getSource()==btn1)
				{
				
				String username=tf1.getText();
				String password=tf2.getText();
				if(username.equals("asif")&&password.equals("0000"))
				{
					JOptionPane.showMessageDialog(null, "Welcome Admin");
					//panel.setBackground(Color.RED);
					Adminpanel panel = new Adminpanel();
				}
			}
					
				
			}
		});
		
		
		btn2.addActionListener( new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		try	
		{	
		showinfo();
		dispose();

		}
		catch(Exception e1)
		{
		System.out.println(e1);
		}
				
		}
		});
		
	}
	public void showinfo(){
		
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	JTextField t1;
	JTextField tf4;
	
	JButton b;
	JButton btn1;
	JRadioButton r1;
	JRadioButton r2;	
	
	JLabel lbl1;
	JLabel lbl2;
	JLabel lbl3;
	JLabel l;
	JLabel lbl4;
		
		JFrame frame = new JFrame();
		frame.dispose();		
		frame.setTitle("MyTitle");
		frame.setSize(500,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	
		JPanel panel = new JPanel();		
		panel.setLayout(null);
		/* btn1 = new JButton("Create"); */
		b = new JButton("ok");
		/* r1 = new JRadioButton("male");
		r2 = new JRadioButton("female"); */
		
		
		lbl1 = new JLabel("UserName");
		lbl2 = new JLabel("Password");
		lbl3 = new JLabel("    Name");
		l = new JLabel("     Gender");
		lbl4 = new JLabel("     AGE");
		
		
		t1 = new JTextField();
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		
		
		lbl1.setBounds(10,30,100,30);
		lbl2.setBounds(10,60,100,30);
		lbl3.setBounds(10,90,100,30);
		l.setBounds(10,120,100,30);
		lbl4.setBounds(10,150,100,30);
	
		tf1.setBounds(75,35,100,20);
		tf2.setBounds(75,65,100,20);
		tf3.setBounds(75,95,100,20);
		t1.setBounds(75,125,100,20); //gender
		tf4.setBounds(75,150,100,20); //age
		
		//btn1.setBounds(400,400,100,30);
		b.setBounds(200,200,50,30);
		//r1.setBounds(250,200,50,30);
		//r2.setBounds(250,250,50,30);
		panel.setBackground(Color.BLUE);
		//btn1.setBackground(Color.RED);
		
		
		panel.setBounds(0,0,500,500);
		
		panel.add(lbl1);
		panel.add(tf1);
		panel.add(lbl2);
		panel.add(tf2);
		panel.add(lbl3);
		panel.add(tf3);
		panel.add(lbl4);
		panel.add(tf4);
		panel.add(l);
		panel.add(t1);
	 	//panel.add(btn1);
		panel.add(t1);
		panel.add(b);
		//panel.add(r1);
		//panel.add(r2);
		//panel.add(l);		
		frame.add(panel);
		
		b.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent e){
			//JOptionPane.showMessageDialog(null, "lol");
			
			try	
				{			
				Class.forName("com.mysql.jdbc.Driver");				
				Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/busmanagement","root",""); 			
				JOptionPane.showMessageDialog(null, "success");
				
				 Statement st = connection.createStatement();	

			String query = "insert into user values(?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, tf1.getText());
			statement.setString(2, tf2.getText());
			statement.setString(3, tf3.getText());			
			statement.setString(5, t1.getText());
			statement.setString(4, tf4.getText());
			statement.execute();
			frame.dispose();
			Login log = new Login();
			log.setVisible(true); 
			
				}
		
				catch(Exception e1)
				{
					System.out.println(e1);
				}	
			
			
			}
			
		});
			
		}

		
		
		
	
}