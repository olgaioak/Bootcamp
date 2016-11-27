package exercise5;

public class ThreadEx5 {
//505000
	public static void main(String[] args) {
		int[] array = new int[1000];
		int i=0;
		for (i = 0; i < array.length; i++) { //fill table
		    array[i] = i + 1;
		}
				
		try{
			SumThreads[] thr = new SumThreads[10];
			for (i=0; i<10; i++){
				
				thr[i] = new SumThreads(array[i*100], array[((1+i)*100)-1]);
				//System.out.println(array[i*100] + " " + array[((1+i)*100)-1]);
			thr[i].start();
			}
			Thread.sleep(100);
			int sum= 0;
			for (int j=0; j<10; j++){
			thr[j].join();
				sum = sum + thr[j].getSum();
			}
			System.out.println("Sum is: " + sum);
			
		} catch (Exception e){
			System.out.println("Interrupted Exception");
			
		}
			
		}
	

}
