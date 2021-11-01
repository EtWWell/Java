//类型转换运算，当吧一种类型变量的值赋值给另外一种基本类型变量时，就涉及到数据转换
//不包括逻辑类型，将剩下其中基本类型按照精度从低到高排序
//byte short char int long float double

public class translate{
	public static void main(String args[]){

		//把级别低的变量赋值给级别高的变量时，系统自动完成数据类型的转换
		int a = 'a';

		//把级别高的变量赋值给级别低的变量时，必须使用类型转换运算,转换后的精度可能会降低
		char b = (char)97;

		//由于小数默认表示为double，double赋值给float为
		float c = (float)23.1;
	}
}