import java.util.Scanner;

public class Testassert{
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		double res = 0;
		int m = 0;
		System.out.println("请输入0到100之间的数:");
		System.out.println("（输入非数字字符停止）");
		while(reader.hasNextDouble()){
			assert reader.nextDouble() >=0 : "输入数字不合法";
			assert reader.nextDouble() <=100 : "输入数字不合法";
			res += reader.nextDouble();
			m++;
		}
		System.out.printf("%d个数的和为%f\n",m,res);
		System.out.printf("%d个数的平均值为%f\n",m,res/m);
	}
}