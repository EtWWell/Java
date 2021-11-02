import java.util.Scanner;

public class inputOutput{
	public static void main(String args[]){
		System.out.println("请输入若干个数，每一行一个数回车确认");
		System.out.println("最后输入数字0结束输入操作");
		Scanner reader = new Scanner(System.in);
		double sum = 0;
		double x = reader.nextDouble();
		while(x != 0){    //这里不能写x != null，因为double和空值不能比较，x != 0是循环的出口
			sum += x;
			x = reader.nextDouble();
		}
		System.out.println("sum="+sum);
	}
}