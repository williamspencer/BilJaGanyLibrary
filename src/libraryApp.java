import java.util.ArrayList;

public class libraryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArrayList<Book> myLibrary=Library.getLibrary();
    myLibrary.get(1).printTitle();

	}

}



