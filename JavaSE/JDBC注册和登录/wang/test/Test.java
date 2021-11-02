package wang.test;
import wang.model.*;
import wang.handle.*;
import java.sql.*;
public class Test{
	public static void main(String args[]){
		Register user = new Register();
		user.setID("moonjava");
		user.setPassword("123456");
		user.setBirth("2000-2-24");
		HandleInsertData handleRegister = new HandleInsertData();
		handleRegister.writeRegisterModel(user);
		Login login = new Login();
		login.setID("moonjava");
		login.setPassword("123456");
		HandleLogin handleLogin = new HandleLogin();
		login = handleLogin.queryVerify(login);
		if(login.getLoginSuccess() == true){
			System.out.println("登录成功");
		}
	}
}