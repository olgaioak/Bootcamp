class Life extends Insurance {
	private int amount;

	/* Sets the amount coordinate  */
	public void setAmount(int amount) {this.amount=amount;}
	/* Returns the amount coordinate  */
	public int getAmount(){return this.amount;}

	Life(int cust_code,int duration, int amount){
		super(cust_code,duration);
		this.amount=amount;
			}

	public String toString(){
		return super.toString() +"\nAmount:"+ cost_calculation();
	}


	public int cost_calculation(){

		for(int i=0;i<10;i++){
			if (HomeWork.cust[i]!= null){
				if(this.cust_code==HomeWork.cust[i].getCode())
					return super.insurance_cost()+ 5*(2016-HomeWork.cust[i].getYear_of_birth());
			}
		}
		return 0;
    }
}