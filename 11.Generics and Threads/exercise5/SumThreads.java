package exercise5;

public class SumThreads extends Thread {
	private int startNumber;
	private int finishNumber;
	private int sum =0;
	
	
	SumThreads (int startNumber, int finishNumber){
		this.startNumber = startNumber;
		this.finishNumber = finishNumber;
	}
	
	
	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	@Override
	public void run (){
		try {
			Thread.sleep((long)(Math.random()*500));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getName() + " "  + startNumber + " " + finishNumber);
		for (int i=startNumber; i<=finishNumber;i++){
			this.sum = this.sum + i;	
			
		}
	}
	

}
