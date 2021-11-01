class LowAndHigh{
	GetAverageScore c;

	LowAndHigh(GetAverageScore c){   //构造方法
		this.c = c;
	}

	void quDiaoLowAndHigh(int[] a){
		java.util.Arrays.sort(a);
		System.out.println("去掉一个最高分："+a[a.length - 1]);
		System.out.println("去掉一个最低分:"+a[0]);
		int[] b = new int[a.length - 2];
		for(int i = 0; i < b.length; i++){
			b[i] = a[i + 1];
		}

		c.getAverageScore(b);
	}
}