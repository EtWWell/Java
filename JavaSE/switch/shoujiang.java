import java.util.Scanner;

public class shoujiang{
	public static void main(String args[]){
		System.out.println("快来抽个奖吧，输入一个正整数：");
		Scanner reader = new Scanner(System.in);
		int shuru = reader.nextInt();

		switch(shuru){
			case 23:
			case 45:
			case 56:
			   System.out.println("恭喜你，中了三等奖");
			   break;
			case 78:
			case 99:
			   System.out.println("恭喜你，中了二等奖");
			   break;
			case 100:
			case 160:
			case 33:
			   System.out.println("恭喜你，中了一等奖");
			   break;
			default :
			   System.out.println("很遗憾，没中奖");

		}
	}
}