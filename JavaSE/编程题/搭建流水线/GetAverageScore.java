class GetAverageScore{    
	void getAverageScore(int[] a){
		int sum = 0;
		int res;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		res = sum/a.length;
		// return res;
		System.out.println("选手的成绩是："+res);  //这里是程序的结束了
	}
}