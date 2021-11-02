public class charArray{
	public static void main(String args[]){
		//这个例子是要说明使用输出println输出int数组时是输出引用，而输出char数组时是输出全部元素地值
		int[] a = new int[]{1, 2, 3, 4, 5};
		//int a[] = {1, 2, 3, 4, 5};
		char[] ch = new char[]{'B', 'O', 'Y'};
		System.out.println(a);
		System.out.println(ch);
		//如果想要输出字符数组的引用需要让数组ch和字符串做并置运算
		System.out.println(""+ch);
	}
}