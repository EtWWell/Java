import java.util.Scanner;
import java.util.InputMismatchException;

public class Application{
	public static void main(String args[]){
		while(true){
			try{
			    Scanner reader =  new Scanner(System.in);
		        System.out.print("请输入需要随机的最大整数：");
		        int a = reader.nextInt();
		        System.out.println("");
		        System.out.print("请输入随机数个数：");
		        int b = reader.nextInt();
		        int[] res = getRandomNumber.getRandom(a, b);
		        System.out.println(java.util.Arrays.toString(res));
		        break;
		    }catch(InputMismatchException e){
			    System.out.println("输入了非法整数，请重新输入");
		    }
		}
	}
}