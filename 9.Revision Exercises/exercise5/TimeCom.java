package exercise5;

public class TimeCom {
	private int hour;
	private int minute;
	private int second;
	
	TimeCom(){
		
	}
	
	TimeCom(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	/** Getters & Setters*/
	public int getHour(){return this.hour;}
	public void setHour(int hour){
		if(hour<0 || hour>23)
			this.hour=0;
		else 
			this.hour=hour;
		}
	public int getMinute(){return this.minute;}
	public void setMinute(int minute){
		if(minute<0 || minute>59)
			this.minute=0;
		else 
			this.minute=minute;
		}
	public int getSecond(){return this.second;}
	public void setSecond(int second){
		if(second<0 || second>59)
			this.second=0;
		else 
			this.second=second;
	}
	
	public String toString(){
		return this.hour +":" + this.minute +":" + this.second;
	}
	
	public void setTime(int h, int m, int s){
		
	}
	

}
