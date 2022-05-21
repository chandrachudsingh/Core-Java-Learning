import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AgeRangeRecords extends JApplet implements ActionListener
{
	JPanel P1,P2;
	JLabel lbmin,lbmax;
	JTextField txmin,txmax;
	JButton btrec;
	
	JTable tb;
	Object[] cols= {"Rollno","name","age","address"};
	
	public void init()
	{
		lbmin=new JLabel("Min Age");
		lbmax=new JLabel("Max Age");
		
		txmin=new JTextField(10);
		txmax=new JTextField(10);
		
		btrec=new JButton("Show Records");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");			
			Statement stmt=con.createStatement();
			stmt.executeUpdate("Create database if not exists StudentDb");   
			stmt.execute("use StudentDb");
			stmt.executeUpdate("create table if not exists PersonalTb(rollno int,name varchar(50),age int,address varchar(200))");
			
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
		
		P1=new JPanel();
		P1.setLayout(new GridLayout(2,2,10,10));
		P1.add(lbmin);
		P1.add(txmin);
		
		P1.add(lbmax);
		P1.add(txmax);
		
		P2=new JPanel();
		P2.setLayout(new GridLayout(2,1,10,10));
		P2.add(btrec);
		
		setLayout(new GridLayout(3,1,10,10));
		add(P1);
		add(P2);
		
		btrec.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");			
			Statement stmt=con.createStatement();
			stmt.executeUpdate("Create database if not exists StudentDb");   
			stmt.execute("use StudentDb");
			stmt.executeUpdate("create table if not exists PersonalTb(rollno int auto_increment,name varchar(50),age int,address varchar(200))");
		 
			PreparedStatement pstmt=con.prepareStatement("select count(*) from PersonalTb where age between ? and ?");
			pstmt.setString(1, txmin.getText());
			pstmt.setString(2, txmax.getText());
			ResultSet rs=pstmt.executeQuery();
			int c=0;
			while(rs.next())
				c=rs.getInt(1);
			
			Object[][] rows=new Object[c][4];
			
			pstmt=con.prepareStatement("select * from PersonalTb where age between ? and ?");
			pstmt.setString(1, txmin.getText());
			pstmt.setString(2, txmax.getText());
			rs=pstmt.executeQuery();
			
			int i=0;
			while(rs.next())
			{	
				rows[i][0]=rs.getInt("rollno");
				rows[i][1]=rs.getString("name");
				rows[i][2]=rs.getInt("age");
				rows[i][3]=rs.getString("address");
				
				i++;
			}
			
			if(tb!=null)                   //for removing the previous entry on re-running
			{
				P2.remove(tb);  
				P2.validate();
			}
			
			tb=new JTable(rows,cols);
			P2.add(tb);
			P2.validate();
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
