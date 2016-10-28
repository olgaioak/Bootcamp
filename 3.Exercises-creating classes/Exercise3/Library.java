class Library{
	Book [] b;

	/* Sets the b coordinate  */
	public void setB(Book []b) {this.b=b;}
	/* Returns the b coordinate  */
	public Book[] getB(){return b;}

	Library(Book [] books){
		this.b = books;

	}

	public void printAvailableBooks(){
		System.out.println("The following books are available at the library for renting");
		for(int i=0; i<20; i++){
			if(b[i].isAvailable())
				System.out.println(b[i].toString());
		}
	}
	public void printBookDetails(String title){
		int j=0; //metritis gia to an yparxei to book
		for (int i=0; i<20; i++){
			if (b[i].getTitle().equals(title)){
				System.out.println("Book found in the library!");
				System.out.println(b[i].toString());
				j=1;
			}
		}
		if (j==0)
			System.out.println("Error. Book doesn't exist");
	}
	public void printBookFromAuthor(String name){
		System.out.println("Book by " +name + "\n");
		for (int i=0;i<20;i++){
			if (this.b[i].hasAuthor(name))
				System.out.println(b[i].toString());
		}

	}
}