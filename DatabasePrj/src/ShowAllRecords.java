import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ShowAllRecords 
{
	public static void main(String[] args) 
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
			
			ResultSet rs=stmt.executeQuery("select * from PersonalTb");
			
			System.out.println("Roll No\tName\tAge\tAddress");
			while(rs.next())
			{
				//System.out.println("Roll no is "+rs.getInt(1));   //by using column index
				//System.out.println("Name is "+rs.getString("name"));
				//System.out.println("Age is "+rs.getInt("age"));
				//System.out.println("Address is "+rs.getString("address"));
				
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getInt("age")+"\t"+rs.getString("address"));
			}
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
