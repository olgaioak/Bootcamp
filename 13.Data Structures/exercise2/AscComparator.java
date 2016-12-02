package exercise2;

import java.util.Comparator;

public class AscComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer a, Integer b){
		return a.compareTo(b);	
	}

}
