import java.util.Scanner;

class suanshu {
	public static void main(String arg[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = reader.nextInt();
		System.out.println("请输入第二个数");
		int b = reader.nextInt();
		int c = a * b;
		System.out.println("a*b="+c);
	}
}