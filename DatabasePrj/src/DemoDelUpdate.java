import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.sql.PreparedStatement;

public class DemoDelUpdate extends JApplet implements ActionListener,ItemListener
{

	JLabel lbroll,lbname,lbage,lbaddress;
	JTextField txname,txage;
	JTextArea taaddress;
	JButton btdelete,btupdate;
	JComboBox cbroll;
	JPanel P1,P2;
	
	public void init()
	{
		cbroll=new JComboBox();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");			
			Statement stmt=con.createStatement();
			stmt.executeUpdate("Create database if not exists StudentDb");
			stmt.execute("use StudentDb");
			stmt.executeUpdate("create table if not exists PersonalTb(rollno int,name varchar(50),age int,address varchar(200))");
			
			ResultSet rs=stmt.executeQuery("select rollno from PersonalTb");
			cbroll.addItem("Select RollNo");
			while(rs.next())
			{
				cbroll.addItem(rs.getInt(1));
			}
			
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
		
		lbroll=new JLabel("Rollno");
		lbname=new JLabel("Name");
		lbage=new JLabel("Age");
		lbaddress=new JLabel("Address");
		
		txname=new JTextField();
		txage=new JTextField();
		taaddress=new JTextArea();
		
		btdelete=new JButton("Delete");
		btupdate=new JButton("Update");
		
		P1=new JPanel();
		P1.setLayout(new GridLayout(4,2,10,10));
		P1.add(lbroll);
		P1.add(cbroll);
		
		P1.add(lbname);
		P1.add(txname);
		
		P1.add(lbage);
		P1.add(txage);
		
		P1.add(lbaddress);
		P1.add(taaddress);
		
		P2=new JPanel();
		P2.setLayout(new GridLayout(2,1,10,10));
		P2.add(btdelete);
		P2.add(btupdate);
		
		setLayout(new GridLayout(2,1,10,10));
		add(P1);
		add(P2);
		
		btupdate.addActionListener(this);
		btdelete.addActionListener(this);
		cbroll.addItemListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object src=ae.getSource();
		
		if(src==btupdate)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");			
				Statement stmt=con.createStatement();
				stmt.executeUpdate("Create database if not exists StudentDb");   
				stmt.execute("use StudentDb");
				stmt.executeUpdate("create table if not exists PersonalTb(rollno int,name varchar(50),age int,address varchar(200))");
				
				PreparedStatement pstmt=con.prepareStatement("update PersonalTb set name=?,age=?,address=? where rollno=?");
				pstmt.setString(1, txname.getText());
				pstmt.setInt(2, Integer.parseInt(txage.getText()));
				pstmt.setString(3, taaddress.getText());
				pstmt.setInt(4, Integer.parseInt(cbroll.getSelectedItem().toString()));
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
		
		else
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");			
				Statement stmt=con.createStatement();
				stmt.executeUpdate("Create database if not exists StudentDb");
				stmt.execute("use StudentDb");
				stmt.executeUpdate("create table if not exists PersonalTb(rollno int,name varchar(50),age int,address varchar(200))");
				
				PreparedStatement pstmt=con.prepareStatement("delete from PersonalTb where rollno=?");
				pstmt.setInt(1, Integer.parseInt(cbroll.getSelectedItem().toString()));
				pstmt.executeUpdate();
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

	@Override
	public void itemStateChanged(ItemEvent ie) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");			
			Statement stmt=con.createStatement();
			stmt.executeUpdate("Create database if not exists StudentDb");
			stmt.execute("use StudentDb");
			stmt.executeUpdate("create table if not exists PersonalTb(rollno int,name varchar(50),age int,address varchar(200))");
			
			PreparedStatement pstmt=con.prepareStatement("select name,age,address from PersonalTb where rollno=?");
			pstmt.setInt(1, Integer.parseInt(cbroll.getSelectedItem().toString()));
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				txname.setText(rs.getString(1));
				txage.setText(rs.getInt(2)+"");
				taaddress.setText(rs.getString(3));
			}
			
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
