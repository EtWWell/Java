interface Com{
	int M = 200;
	int f();
}
class ImpCom implements Com{
	// public int f(){
	// 	return 100 + M;
	// }
	// int f(){
	// 	return 100;
	// }
	// public double f(){
	// 	return 2.6;
	// }
	public abstract int f();
}