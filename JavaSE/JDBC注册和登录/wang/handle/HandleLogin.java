package wang.handle;
import wang.model.Login;
import java.sql.*;
import javax.swing.JOptionPane;
public class HandleLogin{
	Connection con;
	PreparedStatement preSql;
	ResultSet rs;
	public HandleLogin(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e){

		}
		String uri = "jdbc:mysql://localhost:3306/user?serverTimezone=Asia/Shanghai";
		try{
			con = DriverManager.getConnection(uri, "root", "123456");
		}catch(SQLException e){}
	}
	public Login queryVerify(Login loginModel){
		String id = loginModel.getID();
		String pw = loginModel.getPassword();
		String sqlStr = "select id, password from register where "+"id = ? and password = ?";
		try{
			preSql = con.prepareStatement(sqlStr);
			preSql.setString(1, id);
			preSql.setString(2, pw);
			rs = preSql.executeQuery();
			System.out.println("正在检查登录…………");
			if(rs.next() == true){
				loginModel.setLoginSuccess(true);
				JOptionPane.showMessageDialog(null, "登录成功", "恭喜",JOptionPane.WARNING_MESSAGE);
			}else {
				loginModel.setLoginSuccess(false);
				JOptionPane.showMessageDialog(null, "登录失败", "登录失败，重新登录", JOptionPane.WARNING_MESSAGE);
			}
			con.close();
		}
		catch(SQLException e){

		}
		return loginModel;
	}
}