public class Rational{
	int numerator = 1;
	int denominator = 1;

	void setNumerator(int a){
		int c = f(Math.abs(a), Math.abs(denominator));
		numerator = a / c;
		denominator = denominator / c;
		if(numerator < 0 && denominator < 0){
			numerator = -numerator;
			denominator = -denominator;
		}
	}
	void setDenominator(int a){
		int c = f(Math.abs(a), Math.abs(denominator));
		numerator = numerator / c;
		denominator = a / c;
		if(numerator < 0 && denominator < 0){
			numerator = -numerator;
			denominator = -denominator;
		}
	}
	int getNumerator(){
		return numerator;
	}
	int getDenominator(){
		return denominator;
	}
	int f(int a, int b){  //计算两个数的最大公约数
		if(a == 0){
			return 1;
		}
		if(a < b){
			int c = a;
			a = b;
			b = c;
		}
		int x = a % b;
		while(x != 0){
			a = b;
			b = x;
			x = a % b;
		}
		return b;
	}
	Rational add(Rational r){
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newnumerator = b * numerator + a * denominator;
		int newdenominator = b * denominator;
		Rational res = new Rational();
		res.setNumerator(newnumerator);
		res.setDenominator(newdenominator);
		return res;
	}
	Rational sub(Rational r){
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newnumerator = b * numerator - a * denominator;
		int newdenominator = b * denominator;
		Rational res = new Rational();
		res.setNumerator(newnumerator);
		res.setDenominator(newdenominator);
		return res;
	}
	Rational muti(Rational r){
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newnumerator = a * numerator;
		int newdenominator = b * denominator;
		Rational res = new Rational();
		res.setNumerator(newnumerator);
		res.setDenominator(newdenominator);
		return res;
	}
	Rational div(Rational r){
		int a = r.getNumerator();
		int b = r.getDenominator();
		int newnumerator = b * numerator;
		int newdenominator = a * denominator;
		Rational res = new Rational();
		res.setNumerator(newnumerator);
		res.setDenominator(newdenominator);
		return res;
	}
}