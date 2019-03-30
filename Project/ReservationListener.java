import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReservationListener implements ActionListener{
		
	MyProject project;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn10;
	JButton btn11;
	JButton btn12;
	JButton btn13;
	JButton btn14;
	JButton btn15;
	JButton btn16;
	JButton btn17;
	JButton btn18;
	JButton btn19;
	JButton btn20;
	
	public ReservationListener(){
	}
	
	public ReservationListener(MyProject project){
		this.project = project;
	}
	
	
	public void actionPerformed(ActionEvent e){
		this.project.dispose();
		
		JFrame frame = new JFrame();
		frame.setTitle("Bus Sit");
		frame.setSize(600, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
			
			
			 JPanel panel = new JPanel();

			
			btn1 = new JButton("1");
			btn2= new JButton("2");
			btn3 = new JButton("3");
			btn4 = new JButton("4");
			btn5 = new JButton("5");
			btn6 = new JButton("6");
			btn7 = new JButton("7");
			btn8 = new JButton("8");
			btn9 = new JButton("9");
			btn10 = new JButton("10");
			btn11 = new JButton("11");
			btn12 = new JButton("12");
			btn13 = new JButton("13");
			btn14 = new JButton("14");
			btn15 = new JButton("15");
			btn16 = new JButton("16");
			btn17 = new JButton("17");
			btn18 = new JButton("18");
			btn19 = new JButton("19");
			btn20= new JButton("20");
			
			panel.setBounds(320,155,150,20);
			panel.setBounds(30,10,30,50);
			panel.setBounds(50,10,30,50);
			panel.setBounds(70,10,30,50);
			panel.setBounds(90,10,30,50);
			panel.setBounds(110,10,30,50);
			panel.setBounds(130,10,30,50);
			panel.setBounds(150,10,30,50);
			panel.setBounds(170,10,30,50);
			panel.setBounds(190,10,30,50);
			panel.setBounds(10,10,30,50);
			panel.setBounds(10,10,30,50);
			panel.setBounds(10,10,30,50);
			panel.setBounds(10,10,30,50);
			panel.setBounds(10,10,30,50);
			panel.setBounds(10,10,30,50);
			panel.setBounds(10,10,30,50);
			panel.setBounds(10,10,30,50);
			panel.setBounds(10,10,30,50);
			panel.setBounds(10,10,30,50);
			
			panel.add(btn1);
			panel.add(btn2);
			panel.add(btn3);
			panel.add(btn4);
			panel.add(btn5);
			panel.add(btn6);
			panel.add(btn7);
			panel.add(btn8);
			panel.add(btn9);
			panel.add(btn10);
			panel.add(btn11);
			panel.add(btn12);
			panel.add(btn13);
			panel.add(btn14);
			panel.add(btn15);
			panel.add(btn16);
			panel.add(btn17);
			panel.add(btn18);
			panel.add(btn19);
			panel.add(btn20);
			
			frame.add(panel);
			
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
		addbtn2();
	}
	});
		
		this.btn3.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn3();
		}
		});
		
				this.btn4.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn4();
		}
		});
		
				this.btn5.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn5();
		}
		});
		
				this.btn6.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn6();
		}
		});
		
				this.btn7.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn7();
		}
		});
		
				this.btn8.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn8();
		}
		});
		
				this.btn9.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn9();
		}
		});
		
				this.btn10.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn10();
		}
		});
		
				this.btn11.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn11();
		}
		});
		
				this.btn12.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn12();
		}
		});
		
				this.btn13.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn13();
		}
		});
		
				this.btn14.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn14();
		}
		});
		
				this.btn15.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn15();
		}
		});
		
				this.btn16.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn16();
		}
		});
		
				this.btn17.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn17();
		}
		});
		
				this.btn18.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn18();
		}
		});
		
		this.btn19.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn19();
		}
		});
		
		this.btn20.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		addbtn20();
		}
		});
			
	}
	

	
	public void addbtn1(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		JPanel panel1 = new JPanel();
		btn1 = new JButton("Reserve");
		panel1.setBounds(10,10,80,100);
		panel1.add(btn1);
		frame.add(panel1);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn1.addActionListener(lis);
		}
		
	public void addbtn2(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel2 = new JPanel();
		btn2 = new JButton("Reserve 2");
		panel2.setBounds(50,10,80,100);
		panel2.add(btn2);
		frame.add(panel2);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn2.addActionListener(lis);
		}
	
		public void addbtn3(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 3");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
		
		public void addbtn4(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 4");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
	
		public void addbtn5(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 5");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
		public void addbtn6(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 6");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn7(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 7");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn8(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 8");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn9(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 9");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn10(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 10");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn11(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 11");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn12(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 12");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn13(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 13");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn14(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 14");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn15(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 15");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn16(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 16");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn17(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 17");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn18(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 18");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn19(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 19");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}
		
				public void addbtn20(){
		JFrame frame = new JFrame();
		frame.setTitle("lel");
		frame.setSize(100,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel3 = new JPanel();
		btn3 = new JButton("Reserve 20");
		panel3.setBounds(10,10,80,100);
		panel3.add(btn3);
		frame.add(panel3);
		
		ReservationListenerSit lis = new ReservationListenerSit(project);
		this.btn3.addActionListener(lis);
		}

	
}