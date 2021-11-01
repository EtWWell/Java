import java.sql.*;
public class TestJDBC{
	public static void main(String args[]){
		Connection con = null;
		Statement sql;
		ResultSet rs;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){}
		String uri = "jdbc:mysql://localhost:3306/emptest?serverTimezone=Asia/Shanghai";
		String user = "root";
		String password = "123456";
		try{
			con = DriverManager.getConnection(uri,user,password);
		}catch(SQLException e){ }
		try{
			sql = con.createStatement();
			rs = sql.executeQuery("select * from Employees");
			while(rs.next()){
				String a = rs.getString(1);
				System.out.println(a);
			}
			con.close();
		}catch(SQLException e){
			System.out.println(e);
		}
	}
}