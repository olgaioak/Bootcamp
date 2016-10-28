class Insurance {
	protected int cust_code;
	protected int ins_code;
	protected int duration;
	private static int counteri; //metavliti tis klasis insurance gia na ayxanw automata to id

	/* Sets the cust_code coordinate  */
	public void setCust_code(int cust_code) {this.cust_code=cust_code;}
	/* Returns the cust_code coordinate  */
	public int getCust_code(){return this.cust_code;}

	/* Sets the ins_code coordinate  */
	public void setIns_code(int ins_code) {this.ins_code=ins_code;}
	/* Returns the ins_code coordinate  */
	public int getIns_code(){return this.ins_code;}

	/* Sets the duration coordinate  */
	public void setDuration(int duration) {this.duration=duration;}
	/* Returns the duration coordinate  */
	public int getDuration(){return this.duration;}

	Insurance(int cust_code, int duration){
		this.cust_code=cust_code;
		this.ins_code=++counteri;
		this.duration=duration;
	}

	public String toString(){
		return "Customer code:"+this.cust_code+"\nInsurance code:"+this.ins_code+"\nDuration:"+this.duration;
	}

	public int insurance_cost(){
		return 100;
	}

	public static void printInsurances(){
		for (int i=0;i<10;i++){
			if (HomeWork.insurance[i]!= null) //an den einai gematos o pinakas de mporei na mou girisei null. to String opote skaei.
				System.out.println(HomeWork.insurance[i].toString()+ "\n");
		}
	}

	public void printInsurance(int in_code){
		for (int i=0;i<10;i++){
			if (HomeWork.insurance[i]!= null && HomeWork.insurance[i].getIns_code()==in_code)
				System.out.println(HomeWork.insurance[i].toString());
		}
	}

	public void printInsuranceByCustCode(int cust_code){
		for (int i=0;i<10;i++){
			if (HomeWork.insurance[i]!= null && HomeWork.insurance[i].getCust_code()==cust_code)
				System.out.println(HomeWork.insurance[i].toString());
		}
	}
}