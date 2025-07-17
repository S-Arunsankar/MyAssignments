package week2_july14;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library book1=new Library();
		String BK=book1.addBook("Harry");
		System.out.println(BK);
		book1.issueBook();

	}

}
