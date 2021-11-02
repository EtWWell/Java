import java.net.*;
public class Example13_2{
	public static void main(String args[]){
		try{
			InetAddress address_1 = InetAddress.getByName("www.sina.com.cn");
			System.out.println(address_1.toString());
			InetAddress address_2 = InetAddress.getByName("125.94.49.222");
			System.out.println(address_2.toString());
			System.out.println(InetAddress.getLocalHost().toString());
		}catch(UnknownHostException e){
			System.out.println("无法找到www.sina.com.cn");
		}
	}
}