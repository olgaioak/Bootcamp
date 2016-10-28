class Customer {
	private int code;
	private String name;
	private int year_of_birth;
	private String sex;
	private static int counter; //metavliti tis klasis gia na ayxanw automata to id

	/* Sets the code coordinate  */
	public void setCode(int code) {this.code=code;}
	/* Returns the code coordinate  */
	public int getCode(){return this.code;}

	/* Sets the name coordinate  */
	public void setName(String name) {this.name=name;}
	/* Returns the name coordinate  */
	public String getName(){return this.name;}

	/* Sets the year_of_birth coordinate  */
	public void setYear_of_birth(int year_of_birth) {this.year_of_birth=year_of_birth;}
	/* Returns the year_of_birth coordinate  */
	public int getYear_of_birth(){return this.year_of_birth;}

	/* Sets the sex coordinate  */
	public void setSex(String sex) {this.sex=sex;}
	/* Returns the sex coordinate  */
	public String getSex(){return this.sex;}

	Customer (String name,int year_of_birth,String sex){
		this.code=++counter;
		this.name=name;
		this.year_of_birth=year_of_birth;
		this.sex=sex;
	}

	public String toString(){
		return "Customer code:"+this.code+"\nCustomer name:"+this.name+"\nYear of birth:"+this.year_of_birth+"\nSex:"+this.sex;
	}
}