class Book {
	private String title;
	private final String isbn;
	private int physical_copies, available_copies,times_rented;
	Author a;

	/* Sets the title coordinate  */
	public void setTitle(String x) {this.title=x;}
	/* Returns the title coordinate  */
	public String getTitle(){return this.title;}


	/* Returns the isbn coordinate. Den dimiourgw set giati einai final opote orizetai mia fora */
	public String getIsbn(){return this.isbn;}


	/* Sets the physical_copies coordinate  */
	public void setPhysical_copies(int x) {this.physical_copies=x;}
	/* Returns the physical_copies coordinate  */
	public int getPhysical_copies(){return this.physical_copies;}


	/* Sets the available_copies coordinate  */
	public void setAvailable_copies(int x) {this.available_copies=x;}
	/* Returns the available_copies coordinate  */
	public int getAvailable_copies(){return this.available_copies;}

	/* Sets the times_rented coordinate  */
	public void setTimes_rented(int x) {this.times_rented=x;}
	/* Returns the times_rented coordinate  */
	public int getTimes_rented(){return this.times_rented;}

	/* Sets the author coordinate  */
	public void setAuthor(Author a) {this.a=a;}
	/* Returns the author coordinate  */
	public Author getAuthor(){return this.a;}

	Book(String title,Author a, String isbn, int physical_copies,int available_copies,int times_rented){
		this.title = title;
		this.a = a;
		this.isbn = isbn;
		this.physical_copies = physical_copies;
		this.available_copies = available_copies;
		this.times_rented = times_rented;
	}

	public String toString(){
		return "Book_Title " +this.title +"\nisbn:" +this.isbn + a.toString()+"\navailable copies:"+ this.available_copies+ "\nphysical copies:"+this.physical_copies+ "\ntimes rented:"+this.times_rented + "\n" ;
	}
	public void rentPhysicalCopy(){
		if (available_copies>0){
			System.out.println ("Success");
			this.available_copies--;
			this.times_rented++;
		}
	}
	public boolean isAvailable(){
		if (getAvailable_copies()>0)
			return true;
		else
			return false;
	}
	public boolean hasAuthor(String name){
		if (this.a.getName().equals(name))
			return true;
		else
		    return false;
	}


}
