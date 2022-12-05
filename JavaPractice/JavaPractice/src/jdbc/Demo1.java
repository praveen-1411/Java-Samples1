package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class Demo1{
	public static void main(String[] args) {
		String jdbcURL = "jdbc:mysql://localhost:3306/demodb?useSSL=false";
		String username = "root";
		String password = "Aipl@123";
		Connection con = null;
		try {
			System.out.println("connection to DB....");
			con = DriverManager.getConnection(jdbcURL,username,password);
			System.out.println("connection is successfull");
		}catch(Exception ex) {
			ex.printStackTrace();
	}
}
}