public class circular{
	int high;
	circle Button;


	public int getVol(){
		return Button.getArea()*high/3;
	}
	public void setHigh(int a){
		high = a;
	}
	public void setButton(circle cir){
		Button = cir;
	}
}