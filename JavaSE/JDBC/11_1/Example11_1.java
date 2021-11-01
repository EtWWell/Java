import java.sql.*;
public class Example11_1{
	public static void main(String args[]){
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con;
		String uri = "jdbc:mysql://localhost:3306/emptest?serverTimezone=Asia/Shanghai";
		String user = "root";
		String password = "123456";
		con = DriverManager.getConnection(uri, user, password);

		Statement sql = con.createStatement();
		ResultSet rs = sql.executeQuery("SELECT * FROM Employees");
		// ResultSet resultSet = stat.executeQuery(sql);
		// ResultSetMetaData rsmd = resultSet.getMetaData();
  //       int columnsNumber = rsmd.getColumnCount();
  //       while (resultSet.next()) {
  //           for (int i = 1; i <= columnsNumber; i++) {
  //               if (i > 1) System.out.print(",  ");
  //               String columnValue = resultSet.getString(i);
  //               System.out.print(columnValue + " " + rsmd.getColumnName(i));
  //           }
  //           System.out.println("");
  //       }
		while(rs.next()){
			String number = rs.getString(1);
			System.out.println(number);
		}
		con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}