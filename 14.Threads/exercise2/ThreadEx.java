package exercise2;

import java.util.Vector;

public class ThreadEx implements Runnable{
    Vector<Long> v ;	
	
	ThreadEx(Vector<Long> v){
		this.v=v;
	}
	
	public void run(){
		try{
			v.add(Thread.currentThread().getId()); //getId method returns long
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println("Exception occured");		
		}
		
		
	}

}
