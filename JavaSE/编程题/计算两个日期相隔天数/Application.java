import java.util.*;

public class Application{
	public static void main(String args[]){
		Calendar calendar = Calendar.getInstance();
		int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]), e = Integer.parseInt(args[4]), f = Integer.parseInt(args[5]);
		calendar.set(a, b - 1, c);
		long time1 = calendar.getTimeInMillis();
		calendar.set(d, e - 1, f);
		long time2 = calendar.getTimeInMillis();
		long days = (time2 - time1)/(24*60*60*1000);
		System.out.println(days);
	}
}