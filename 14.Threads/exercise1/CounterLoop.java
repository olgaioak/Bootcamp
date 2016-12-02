package exercise1;

public class CounterLoop implements Runnable {
	private int counter;
	
	CounterLoop(int counter){
		this.counter = counter;
	}
	
	public void run(){
		try {
		
			for (int i=0; i<counter; i++){
				System.out.println("i is "+ i);
				Thread.sleep(2000);
			}
			
		}catch (InterruptedException e){
			System.out.println("i havent finished");
		}
		
	}

}
