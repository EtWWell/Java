import java.util.Random;

public class getRandomNumber{
	public static int [] getRandom(int max, int count){
		int[] res = new int[count];
		int index = 0;
		Random random = new Random();

		while(index < count){
			int number = random.nextInt(max) + 1;
			boolean has = false;
		    for(int a : res){
			    if(number == a){
				    has = true;
			    }
		    }
		    if(has == false){
		    	res[index++] = number;
		    }
		}
		return res;
	}
}