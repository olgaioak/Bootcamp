package exercise5;

public class SumThreads extends Thread {
	private int startNumber;
	private int finishNumber;
	
	SumThreads (int startNumber, int finishNumber){
		this.startNumber = startNumber;
		this.finishNumber = finishNumber;
	}
	
	public int sum (){
		int sum=0;
		for (int i=startNumber; i<=finishNumber;i++){
			sum = sum + i;	
			
		}
		return sum;
	}
	

}
