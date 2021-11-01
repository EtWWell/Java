public class Test{
	public static void main(String args[]){
		Rational testone = new Rational();
		testone.setDenominator(-8);
		testone.setNumerator(6);
		Rational testtwo = new Rational();
		testtwo.setNumerator(4);
		testtwo.setDenominator(5);
		//Rational res = testone.add(testtwo);   //加
		//Rational res = testone.sub(testtwo);   //减
		// Rational res = testone.muti(testtwo);     //乘
		Rational res = testone.div(testtwo);     //除
		System.out.println(res.getNumerator()+"/"+res.getDenominator());
	}
}