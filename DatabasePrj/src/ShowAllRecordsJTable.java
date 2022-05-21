import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JApplet;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ShowAllRecordsJTable extends JApplet
{	
	JScrollPane Jsp;
	JTable tb;
	Object[] cols= {"Rollno","name","age","address"};
	
	public void init()
	{	
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");   //to load driver class
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
											//to build connection between Java and database 
			Statement stmt=con.createStatement();
			stmt.executeUpdate("Create database if not exists StudentDb");   
					//"if not exists" used because of database not created multiple times(error)
			
			stmt.execute("Use StudentDb");
			stmt.executeUpdate("Create table if not exists PersonalTb(rollno int auto_increment,"
					+ "name varchar(50),age int, address varchar(200),primary key(rollno))");
			
			ResultSet rs=stmt.executeQuery("select count(*) from PersonalTb"); //to count no. of entries
			int c=0;
			while(rs.next())         //runs only one time
				c=rs.getInt(1);
			
			Object[][] rows=new Object[c][4];
			rs=stmt.executeQuery("select * from PersonalTb");
			int i=0;
			while(rs.next())
			{	
				rows[i][0]=rs.getInt("rollno");
				rows[i][1]=rs.getString("name");
				rows[i][2]=rs.getInt("age");
				rows[i][3]=rs.getString("address");
				
				i++;
			}
			
			JTable tb=new JTable(rows,cols);
			Jsp=new JScrollPane(tb,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			add(Jsp);
			
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
