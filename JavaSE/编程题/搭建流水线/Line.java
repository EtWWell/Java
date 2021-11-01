class Line{
	//声明对象
	ScoreGiver scoreGiver;
	LowAndHigh lowAndHigh;
	GetAverageScore getAverageScore;

	Line(){  //这下面的三个对象创建顺序只能是这样，不能打乱
		//创建对象，为对象分配内存空间
		getAverageScore = new GetAverageScore();
		lowAndHigh = new LowAndHigh(getAverageScore);
		scoreGiver = new ScoreGiver(lowAndHigh);
	}
	void getPersonScore(){
		scoreGiver.shouJi();
	}
}