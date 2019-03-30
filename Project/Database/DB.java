package Project.Database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.*;

public class DB{
	public Statement database(){
		Statement st=null;
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.jdbc.Driver");
			//step2 create  the connection object  
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/databasedb","root",""); 
		//step3 create the statement object  
		 st = con.createStatement();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return st;
	}
}               
  
