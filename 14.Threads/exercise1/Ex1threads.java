package exercise1;

public class Ex1threads {

	public static void main(String[] args)  {
		
		try{
		
			long patience = Long.parseLong(args[0]);
			int counter = Integer.parseInt(args[1]);
			
			long startTime = System.currentTimeMillis();
			
			Thread thr = new Thread(new CounterLoop(counter));
			thr.start();
			while(thr.isAlive()){
				thr.join(1000);
				if(System.currentTimeMillis()-startTime>patience){
					System.out.println("i'm bored waiting");
					thr.interrupt();
					thr.join();
				}
			}
		}catch(InterruptedException e){
			
		}
	}

}
