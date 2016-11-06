package exercise5;

import java.util.Comparator;

public class TimeComparator implements Comparator<TimeCom> {
	
	public int compare(TimeCom time1, TimeCom time2){
		if(time1.getHour()!=time2.getHour())
			return time1.getHour()-time2.getHour();
		else {
			if (time1.getMinute()!= time2.getMinute()){
				System.out.println("Minutes difference");
				return time1.getMinute()-time2.getMinute();
			}else {
				if (time1.getSecond()!= time2.getSecond()){
				System.out.println("Seconds difference");
				return time1.getSecond()-time2.getSecond();
				}
			}
			
		}
		return 0;	
		
	}

}
