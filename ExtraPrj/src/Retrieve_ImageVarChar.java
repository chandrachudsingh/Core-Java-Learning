import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Retrieve_ImageVarChar 
{
	public static void main(String[] args) throws Exception 
	{
		JFrame F= new JFrame();
		F.setVisible(true);
		F.setSize(300, 300);
		F.setLayout(new FlowLayout());
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
		Statement stmt=conn.createStatement();
		stmt.execute("use ImageTrial");
		
		PreparedStatement pstmt = conn.prepareStatement("SELECT descp, img FROM ImageVarCharTb");
		ResultSet resultSet = pstmt.executeQuery();
		while (resultSet.next())
		{
			String description = resultSet.getString(1);
			System.out.println(description );
			String image =resultSet.getString(2);
			System.out.println(image);
			F.add(new JLabel(new ImageIcon(image)));
		}
		
		conn.close();
	}
}