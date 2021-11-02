public class output{
	public static void main(String args[]){
		System.out.print("你好，我是wq");
		System.out.println("HelloWorld");
		System.out.println(123+"大于"+122);  //Java中使用'+'并置（不同内容一起）输出
		System.out.printf("%d,%c",145,'a');  //这是Java学C语言的，注意这里的是printf而不是print或println
		System.out.println("我是一只小小小小鸟"+
			"想要飞 却怎么飞也飞不高");    //Java的输出中不能单独地使用空格，这里使用并置符号'+'实现空格换行
	}
}