import java.util.Scanner;  //导入Scanner类

public class Example2_5{
	public static void main(String args[]){
		//判断一个数在不在数组中
		int[] a = new int[]{45, 34, 56, 89, 99, 56, 78, 170};
		//数组排序，选择排序
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				int temp = 0;
				//a[j]小就交换
				if(a[j] < a[i]){
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		//用户输入
		System.out.println("请输入整数数字:");
		Scanner reader = new Scanner(System.in);
		int input = reader.nextInt();  //nextInt方法，看起来像是包装类，不过int的包装类应该是Integer
		//二分查找，查询数组中有没有输入的数字
		int start,middle,end;
		start = 0;
		end = a.length;  //这里的end值设置为a.length而不是a.length - 1是为了判断最后一个数
		int curr = 0;   //curr出了循环还要使用，所以在循环外面声明
		middle = (start + end) / 2;
		while(input != a[middle]){
			if(input > a[middle]){
				start = middle;
			}else if(input < a[middle]){
				end = middle;
			}
			middle = (start + end) / 2;
			curr++;
			if(curr > (a.length)/2){
				break;
			}
		}
		if(curr > (a.length) / 2){
			System.out.println("整数"+input+"不在数组中");
		}else {
			System.out.println("整数"+input+"在数组中");
		}
	}
}