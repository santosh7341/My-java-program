package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB 
{
	public static Connection connectDb()
	{
		Connection con =null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "SANTOSH7341");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;
			
	}

	
}
