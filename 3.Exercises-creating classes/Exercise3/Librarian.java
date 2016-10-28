class Librarian {
	private Library library;

	Librarian(Library library){
		this.library = library;
	}

	public void findMeBooksFromAuthor(String author){
		this.library.printBookFromAuthor(author);
	}
	public void findMeAvailableBooks(){
		this.library.printAvailableBooks();
	}
	public void findMeBook(String ti){
		this.library.printBookDetails(ti);
	}
}