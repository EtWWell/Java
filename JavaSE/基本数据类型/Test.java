//Java中没有对整数类型byte,short的表示法
public class test{
	public static void main(String args[]){

		//如果要强调一个整数是byte或者short类型，可以把int转换成byte和short
		byte a = (byte)100;
		short b = (short)678;
		System.out.println("byte a:"+a);
		System.out.println("short b:"+b);

		//long类型的整数表示法
		long c = 12345L;
		System.out.println("long c:"+c);

		//特殊字符不能通过键盘输入，可以使用转义字符常量表示，如\n表示换行，\"表示双引号，\\表示反斜号
		char d = '\\';
		System.out.println("反斜号："+d);

		//上面有int转byte和short的方法，int和char也可以互相转换,java使用的字符集是Unicode，char的取值范围是0~65535，a取值97。
		//你可以这样给一个字符赋值
		char e = 'a';
		System.out.println("e:"+e);
		//也可以这样
		char f = 97;
		System.out.println("十进制97对应Unicode中的字符："+f);

		//如何知道一个字符在Unicode对应的值呢？比如a对应97，如何得知一个值在Unicode中对应的字符
		int g = (int)'a';
		System.out.println("a在Unicode中对应的整数为："+g);
		char h = (char)97;
		System.out.println("97在Unicode中对应的字符为："+h);

		//上面字符对应的值为十进制表示的，Java中可以使用十六进制转移表示字符
		char i = '\u0061';
		System.out.println("十六进制数的转义---\u0061在Unicode中表示的字符是："+i);

		//浮点类型分为单精度和双精度，单精度存储8位有效数字，双精度存储16位有效数字。
		//他们的表示方法是
		float j = 0.4f;
		double k = 0.4d;
		//编程是工科，实践出真知识，搞不明白Java中的float和double占多少字节，具体精度怎么表示就去实践吧
		//小数的默认表示法表示的是double类型，例如21.4其实是21.4D

	}
}