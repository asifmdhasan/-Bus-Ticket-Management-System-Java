import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;
import java.sql.PreparedStatement;

public class Busmanagment extends JPanel{
	Adminpanel mange;
	// Admin a1;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JLabel lbl1;
	JLabel lbl2;
	JLabel lbl3;
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	static Object[][] databaseInfo;
	static DefaultTableModel dTableModel;
	
	public Busmanagment(){
		
	}
	
	public Busmanagment(Adminpanel mange){
	
	this.mange = mange;
	this.setLayout(null);
	this.setBackground(Color.YELLOW);
	this.setBackground(Color.GREEN);
	
	
	
	JTable table = new JTable();

	Object [] columns = {"Id","Name","Time"};
	DefaultTableModel model = new DefaultTableModel();
	model.setColumnIdentifiers(columns);
	table.setModel(model);	
	
	
	
	this.btn1 = new JButton("Add Bus");
	this.btn2 = new JButton("Remove Bus");
	this.btn3 = new JButton("Update Bus");
	 	
	this.lbl1 = new JLabel("busid");
	this.lbl2 = new JLabel("busname");
	this.lbl3 = new JLabel("time");
	//this.lbl4 = new JLabel(":");
	 
	this.tf1 = new JTextField();
 	this.tf2 = new JTextField();
	this.tf3 = new JTextField();
	//this.tf4 = new JTextField();
	 
	this.lbl1.setBounds(10,30,100,30);
	this.lbl2.setBounds(10,70,100,30);
	this.lbl3.setBounds(10,105,100,30);
	//this.lbl4.setBounds(115,102,100,30);
	this.tf1.setBounds(80,30,100,25);
	this.tf2.setBounds(80,70,100,25);
	this.tf3.setBounds(80,110,100,20);
	//this.tf4.setBounds(120,110,30,20);
	this.btn1.setBounds(400,30,105,30);
	this.btn2.setBounds(400,70,105,30);
	this.btn3.setBounds(400,110,105,30);
	
	this.add(lbl1);
	this.add(lbl2);
	this.add(lbl3);
	//this.add(lbl4);
	this.add(tf1);
	this.add(tf2);
	this.add(tf3);
	//this.add(tf4);
	this.add(btn1);
	this.add(btn2);	 		
	this.add(btn3);
	
	JScrollPane panel = new JScrollPane(table);
	panel.setBounds (0,200,785,600);
	this.add(panel);
		Object[] row = new Object[3];

	btn2.addActionListener( new ActionListener(){
		
	
		public void actionPerformed(ActionEvent e){
			
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/busmanagement","root","");
			String query = "DELETE FROM busregistration WHERE busid=?";
			PreparedStatement statement = connection.prepareStatement(query);
			
		    statement.setString(1, tf1.getText());
			// statement.setString(2, tf2.getText());
			// statement.setString(3, tf3.getText());
			statement.executeUpdate();
			JOptionPane.showMessageDialog(null, "Delete Successfully");
	
		}
		catch(Exception ae){
			System.out.println(ae);
		}
		} 
	});


		btn1.addActionListener( new ActionListener(){
		
	
		public void actionPerformed(ActionEvent e){
			
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/busmanagement","root","");
			
			String query = "insert into busregistration values(?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, tf1.getText());
			statement.setString(2, tf2.getText());
			statement.setString(3, tf3.getText());
			
			statement.execute();
			row[0] = tf1.getText();
			row[1] = tf2.getText();
			row[2] = tf3.getText();
		model.addRow(row);
		}catch(Exception ae){
			System.out.println(ae);
		}
		} 
	
		});
		
		
		
		btn3.addActionListener( new ActionListener(){
		
	
		public void actionPerformed(ActionEvent e){
			
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/busmanagement","root","");
			String query = "UPDATE busregistration SET busname=?,time=? WHERE busid=?";
			PreparedStatement statement = connection.prepareStatement(query);
			
		    statement.setString(1, tf1.getText());
			statement.setString(2, tf2.getText());
			statement.setString(3, tf3.getText());
			statement.executeUpdate();
			statement.execute();
			row[0] = tf1.getText();
			row[1] = tf2.getText();
			row[2] = tf3.getText();
		model.addRow(row);
			//JOptionPane.showMessageDialog(null, "UPDATE Successfully");
	
		}
		catch(Exception ae){
			System.out.println(ae);
		}
		} 
	});
		
		
	}
}
