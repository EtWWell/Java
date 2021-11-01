public class num3_2{
	public static void main(String args[]){
		//求100以内的全部素数
		System.out.println("100以内的全部素数：");
		for(int i = 1; i <= 100; i++){
			//判断i是不是素数
			//i除以j,j从2开始，到i/2结束，如果存在i%j == 0，则i不是素数
			int j = 2;
			for( ; j <= i/2; j++){
				if(i%j == 0){
					break;
				}
			}
			if(j > i/2){
				System.out.print(i+" ");
			}
		}
	}
}