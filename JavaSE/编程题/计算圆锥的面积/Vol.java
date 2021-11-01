import java.util.Scanner;

public class Vol{
	public static void main(String args[]){
		//请输入圆锥的底面圆的半径
		System.out.print("请输入圆锥的底面圆的半径:");
		Scanner readerone = new Scanner(System.in);
		int a = readerone.nextInt();
		//请输入圆锥的高
		System.out.print("请输入圆锥的高：");
		Scanner readerotwo = new Scanner(System.in);
		int b = readerotwo.nextInt();

		circular cirar = new circular();
		cirar.setButton( new circle() );
		cirar.Button.setBanjin(a);
		cirar.setHigh(b);
		System.out.print("圆锥的体积："+cirar.getVol());
	}
}