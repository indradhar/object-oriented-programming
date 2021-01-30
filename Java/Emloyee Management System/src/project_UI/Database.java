package project_UI;
import java.sql.*;
public class Database 
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	public Database()
	{
		connect();
	}
	
	public void connect()
	{
		try
		{
			String driver="sun.jdbc.odbc.JdbcOdbcDriver";
			Class.forName(driver);
			
			String Database="jdbc:odbc:GUI";
			con =DriverManager.getConnection(Database);
			st=con.createStatement();
			
			String sql="select * from emplyees";
			rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				String id=rs.getString("ID");
				String Fname=rs.getString("Fname");
				String Lname=rs.getString("Lname");
				String age=rs.getString("Age");
				
				System.out.println(id+" "+Fname+" "+Lname+" "+age);
			}
		}
		catch(Exception ex)
		{
			
		}
	}
	
	public static void main(String[] args)
	{
		new Database();
	}
}
