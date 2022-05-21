import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoInsert extends JApplet implements ActionListener
{
	JLabel lbname,lbage,lbaddress;
	JTextField txname,txage;
	JTextArea taaddress;
	JButton btinsert;
	JPanel P1,P2;
	
	public void init()
	{
		lbname=new JLabel("Name");
		lbage=new JLabel("Age");
		lbaddress=new JLabel("Address");
		
		txname=new JTextField();
		txage=new JTextField();
		taaddress=new JTextArea();
		
		btinsert=new JButton("Insert");
		
		P1=new JPanel();
		P1.setLayout(new GridLayout(3,2,10,10));
		P1.add(lbname);
		P1.add(txname);
		
		P1.add(lbage);
		P1.add(txage);
		
		P1.add(lbaddress);
		P1.add(taaddress);
		
		P2=new JPanel();
		P2.setLayout(new GridLayout(1,1));
		P2.add(btinsert);
		
		setLayout(new GridLayout(2,1,10,10));
		add(P1);
		add(P2);
		
		btinsert.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "");
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create database if not exists StudentDb");
			stmt.execute("use StudentDb");
			stmt.executeUpdate("create table if not exists PersonalTb(rollno int auto_increment primary key,name varchar(50),age int, address varchar(200))");
			
			String name=txname.getText();
			int age=Integer.parseInt(txage.getText());
			String address=taaddress.getText();
			
			PreparedStatement pstmt=con.prepareStatement("insert into PersonalTb(name,age,address) values(?,?,?)");
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, address);
			pstmt.executeUpdate();
			
			con.close();
		}
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
