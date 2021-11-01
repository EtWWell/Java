import java.awt.*;
import java.awt.event.*;
public class E implements Runnable{
	static StringBuffer buffer = new StringBuffer();
	Thread t1, t2;
	E(){
		t1 = new Thread(this);
		t2 = new Thread(this);
	}
	public synchronized void addChar(char c){
		if(Thread.currentThread() ==  t1){
			while(buffer.length() == 0){
				try{
					wait();
				}
				catch(Exception e){}
			}
			buffer.append(c);
		}else if(Thread.currentThread() == t2){
			buffer.append(c);
			notifyAll();
		}
	}
	public static void main(String args[]){
		E hello = new E();
		buffer.append('S');
		hello.t1.start();
		hello.t2.start();
		while(hello.t1.isAlive() || hello.t2.isAlive()){
			System.out.println(hello.buffer);
		}
	}
	public void run(){
		if(Thread.currentThread() == t1)
			addChar('A');
		if(Thread.currentThread() == t2)
			addChar('B');
	}
}