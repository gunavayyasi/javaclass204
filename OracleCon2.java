import java.sql.*;
class  OracleCon2
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.199.20.3:1521:mother","mtcab2215","mtcab2215");
			
			Statement stmt=con.createStatement();
			String s;
			s="insert into student1"+ "(rollno,sname,age)"+"values(91,'test21',31)";
			ResultSet rs=stmt.executeQuery(s);
			stmt.executeUpdate(s);
			System.out.println("one row inserted");
			con.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}
}
