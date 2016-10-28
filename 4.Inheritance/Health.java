class Health extends Insurance {
	private int med_expense;

	/* Sets the med_expense coordinate  */
	public void setMed_expense(int med_expense) {this.med_expense=med_expense;}
	/* Returns the med_expense coordinate  */
	public int getMed_expense(){return this.med_expense;}

	Health(int cust_code,int duration, int med_expense){
		super(cust_code,duration);
		this.med_expense=med_expense;
		}


	public String toString(){
		return super.toString() +"\nMedical Expenses:"+ cost_calcul();
	}
    public int cost_calcul(){
		for(int i=0;i<10;i++){
			if (HomeWork.cust[i]!= null){
				if(this.cust_code==HomeWork.cust[i].getCode())
					med_expense = super.insurance_cost()+ 7*(2016-HomeWork.cust[i].getYear_of_birth());
				if (HomeWork.cust[i].getSex()=="male")
					med_expense= med_expense +50;
			}
		}
		return med_expense;
	}
}