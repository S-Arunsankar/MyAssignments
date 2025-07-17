package week2_july14;

public class Library {

	
	public String addBook(String bookTitle) {
		// TODO Auto-generated method stub
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book Issued Successfully");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library books = new Library();
		String BKS=books.addBook("Games");
		System.out.println(BKS);
		books.issueBook();

	}

}
