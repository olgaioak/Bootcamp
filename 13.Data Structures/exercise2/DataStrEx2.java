package exercise2;

import java.util.Comparator;
import java.util.PriorityQueue;


public class DataStrEx2 {
	
	public static void main(String []args){
		
		Comparator<Integer> comparator = new AscComparator();
		PriorityQueue<Integer> myqueue = new PriorityQueue<Integer>(50, comparator);
		myqueue.add(8);
		System.out.println(myqueue);
		myqueue.add(5);
		System.out.println(myqueue);
		myqueue.add(3);
		System.out.println(myqueue);
		myqueue.add(10);
		System.out.println(myqueue);
		
		while(!myqueue.isEmpty()){
			Integer i = myqueue.poll();
			System.out.println(i);
		}
	}
	
	
	

}
