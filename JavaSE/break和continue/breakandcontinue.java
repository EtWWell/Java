public class breakandcontinue{
	public static void main(String args[]){
		//计算1+3+5+7+9
		int sum = 0;
		for(int i = 1 ; i < 10 ; i++){
			if(i % 2 == 0){
				continue;
			}
			sum += i;
		}
		System.out.println("sum="+sum);

		//找出100以内所有的素数
		for(int i = 2; i <= 100; i++){
			int j = 2;
			for( ; j <= i/2; j++){
				if(i % j == 0){
					break;
				}
			}
			if(j > i/2){
				System.out.print(i+" ");
			}
		}
	}
}