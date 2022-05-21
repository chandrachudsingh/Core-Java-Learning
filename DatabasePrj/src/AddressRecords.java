import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AddressRecords extends JApplet implements ItemListener
{
	JPanel P1,P2;
	JComboBox cbadd;
	JLabel lbadd;
	JTable tb;
	Object[] cols= {"Rollno","name","age","address"};
	
	public void init()
	{
		lbadd=new JLabel("Address");
		
		cbadd=new JComboBox();
		cbadd.addItem("select address");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");			
			Statement stmt=con.createStatement();
			stmt.executeUpdate("Create database if not exists StudentDb");   
			stmt.execute("use StudentDb");
			stmt.executeUpdate("create table if not exists PersonalTb(rollno int,name varchar(50),age int,address varchar(200))");
			
			ResultSet rs=stmt.executeQuery("select distinct address from PersonalTb");
			while(rs.next())
			{
				cbadd.addItem(""+rs.getString(1));
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
		
		P1=new JPanel();
		P1.setLayout(new FlowLayout());
		P1.add(lbadd);
		P1.add(cbadd);
		
		
		P2=new JPanel();
		P2.setLayout(new GridLayout(1,1));
		
		setLayout(new GridLayout(2,1));
		add(P1);
		add(P2);
		
		cbadd.addItemListener(this);
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
		 
			PreparedStatement pstmt=con.prepareStatement("select count(*) from PersonalTb where address=?");
			pstmt.setString(1, cbadd.getSelectedItem().toString());
			ResultSet rs=pstmt.executeQuery();
			int c=0;
			while(rs.next())
				c=rs.getInt(1);
			
			Object[][] rows=new Object[c][4];
			
			pstmt=con.prepareStatement("select * from PersonalTb where address=?");
			pstmt.setString(1, cbadd.getSelectedItem().toString());
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
				P2.remove(tb);              
			P2.validate();
			
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
