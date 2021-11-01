import java.util.Scanner;

class ScoreGiver{
	LowAndHigh b;
    
    ScoreGiver(LowAndHigh one){  //构造方法
    	b = one; 
    }
	void shouJi(){
		System.out.println("请输入评委的个数：");
		Scanner readerone = new Scanner(System.in);
		int renshu = readerone.nextInt();

		System.out.println("请输入评委给出的分数");
		Scanner readertwo = new Scanner(System.in);

		int[] a = new int[renshu];
		for(int i = 0; i < renshu; i++){
			a[i] = readertwo.nextInt();
		}

		b.quDiaoLowAndHigh(a);
	}
}