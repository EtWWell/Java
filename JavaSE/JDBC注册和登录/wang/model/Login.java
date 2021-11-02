package wang.model;
public class Login{
	boolean loginSuccess = false;
	String id;
	String password;
	public void setID(String id){
		this.id = id;
	}
	public String getID(){
		return id;
	}
	public void setLoginSuccess(boolean loginSuccess){
		this.loginSuccess = loginSuccess;
	}
	public boolean getLoginSuccess(){
		return loginSuccess;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return password;
	}
}