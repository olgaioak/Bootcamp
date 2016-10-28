class Author {

	private String name;
	/* Sets the name coordinate  */
	public void setName(String x) {this.name=x;}
	/* Returns the name coordinate  */
	public String getName(){return this.name;}

	Author (String name){
		this.name=name;
	}

	public String toString(){
		return " \nauthor name " + this.name;
	}

}
