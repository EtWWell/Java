public class Example3_1{
	public static void main(String args[]){
		char a = 'A';
		char[] yuanhua = new char[]{'十','点','进','攻'};
		//加密
		for(int i = 0; i < yuanhua.length; i++){
			yuanhua[i] = (char)(yuanhua[i] ^ a);
		}
		System.out.println(yuanhua);
		//解密
		for(int i = 0; i < yuanhua.length; i++){
			yuanhua[i] = (char)(yuanhua[i] ^ a);
		}
		System.out.println(yuanhua);
	}
}