package exercise2;

import java.util.Iterator;
import java.util.Vector;

public class Ex2threads {

	public static void main(String[] args) {
		Vector<Long> vec = new Vector<>();
		
		Thread thr1 = new Thread(new ThreadEx(vec));
		Thread thr2 = new Thread(new ThreadEx(vec));
		Thread thr3 = new Thread(new ThreadEx(vec));
		
		thr1.start();
		thr2.start();
		thr3.start();
		
		try{
			thr1.join();
			thr2.join();
			thr3.join();
			
			System.out.println("Vector size " + vec.size());
			
			Iterator<Long> it = vec.iterator();
			while (it.hasNext()){
				Long item = it.next();
				System.out.println("Item " + item);
				
			}
			
		}catch(InterruptedException e){
			System.out.println("Exception occured in main method");
			
		}

	}

}
