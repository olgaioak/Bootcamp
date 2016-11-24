package exercise2;

import java.util.Arrays;

public class GenericsEx2 {
	
	
	public static void main(String[] args) {
		int [] first = {1,2,3,4,5,6,7,8,9,10};
		double [] second = {1,2,3,4,5,6,7,8,9,10};
		
		Integer[] newFirst = new Integer[first.length];
		int i = 0;
		for (int value : first) {
		    newFirst[i++] = Integer.valueOf(value);
		}
		
		Double[] newSecond = new Double[second.length];
		for (int j = 0; j<second.length; j++) {
		    newSecond[j] = Double.valueOf(second[j]);
		}
		sawp(newFirst);
		sawp(newSecond);
		System.out.println(Arrays.toString(newFirst));
		System.out.println(Arrays.toString(newSecond));

		
		
	}
	
	public static <T> void sawp(T[] a) {
		T temp;
		for (int i=0; i<(a.length/2); i++){
			temp= a[i];
			a[i]= a[a.length - (1 +i)];
			a[a.length - (1 +i)] = temp;
		}
		
	}

}
