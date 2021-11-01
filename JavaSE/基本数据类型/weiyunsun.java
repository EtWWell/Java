public class weiyunsun{
	public static void main(String args[]){
		int a = 8;
		int b = 4;
		//位运算，精度都是取精度高的

		//'&'，按位与运算，同为1则是1，否则0，双目
		System.out.println( a & b);

		//'|'，按位或运算，同为0则为0，否则1，双目
		System.out.println( a | b);

		//'~'，按位非运算，取反即可？单目
		System.out.println( ~a);

		//'^'，按位异或运算，相同为0，不同为1
		System.out.println( a ^ b);


	}
}