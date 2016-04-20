import java.util.ArrayList;
import java.util.Scanner;

public class libraryApp {
static Scanner sc = new Scanner(System.in);
static ArrayList<Book> myLibrary;
	public static void main(String[] args) {
	String input;
	myLibrary=Library.getLibrary();
//    myLibrary.get(1).printTitle();
	
	System.out.println("Welcome to the best library in the world!");
	System.out.println("Full of the rarest books in creation\n");
	System.out.println("THE BILJAGANY LIBRARY!!!!\n");
	
	printMenu();
	input = sc.nextLine();
	optionMenu(input);	

	}
	public static void optionMenu(String input) {
		switch(input){
			case "1":
				printLibrary();
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			default :
				System.out.println("Enter a valid option, you peasant.\n");
				break;
		}
		}
	public static void printLibrary(){
		for (int i = 0; i < myLibrary.size(); i++){
//			this prints all info on each book NEED METHOD
			System.out.println(myLibrary.get(i).printBook());
		}
	}
	public static void printMenu() {
		System.out.println("Main Menu:");
		System.out.println("1 - See Entire Catalog");
		System.out.println("2 - Search");
		System.out.println("3 - Bookcart");
		System.out.println("4 - BilJaGamy's Picks");
		System.out.println("5 - Exit");
		System.out.print("\nEnter menu number: ");
	}
}




