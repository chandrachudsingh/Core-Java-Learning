import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoDataBase {

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
			stmt.executeUpdate("Insert into PersonalTb(name,age,address)values('Anu','21','jnv')");
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
