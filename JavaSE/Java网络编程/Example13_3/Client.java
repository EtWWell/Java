import java.io.*;
import java.net.*;
public class Client{
	public static void main(String args[]){
		String [] mess = {"今年多大了？","大学毕业了吗？","有女朋友吗？"};
		Socket mysocket;
		DataInputStream in = null;
		DataOutputStream out = null;
		try{
			mysocket = new Socket("127.0.0.1", 2010);
			in = new DataInputStream(mysocket.getInputStream());
			out = new DataOutputStream(mysocket.getOutputStream());
			for(int i = 0; i < mess.length; i++){
				out.writeUTF(mess[i]);
				String s = in.readUTF();
				System.out.println("客户端收到服务器的回答："+s);
				Thread.sleep(5000);
			}
		}catch (Exception e){
			System.out.println("服务器已断开"+e);
		}
	}
}