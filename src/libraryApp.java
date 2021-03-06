import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

//by Bill Spencer, James Kelly & Mohogany 

public class libraryApp {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Book> myLibrary;
	static ArrayList<Book> checkOut;
	static String username;
	
	public static void welcomeMenu() {
		System.out.println("Welcome to the best library in the world!");
		System.out.println("Full of the rarest books in creation\n");
		System.out.println("THE BILJAGANY LIBRARY!!!!\n");
		System.out.println("What is your name?");
		username = sc.nextLine();
	}
	
	public static void printMenu() {
		System.out.println("Hello " + username + ", this is the Main Menu:");
		System.out.println("1 - See Entire Catalog");
		System.out.println("2 - Search");
		System.out.println("3 - Bookcart");
		System.out.println("4 - BilJaGamy's Picks");
		System.out.println("5 - Exit");
		System.out.print("\nEnter menu number: ");
		optionMenu();
	}

	public static void optionMenu() {
		String input = sc.nextLine();
		while (true) {

		switch (input) {
			case "1":
				printLibrary();
				break;
			case "2":
				printSearchMenu();
				break;
			case "3":
				getBookcart();
				break;    
			case "4":
				generateRandomBook();
				break;
			case "5":
				System.out.println("Goodbye!");
				return;
			default:
				System.out.println("Please enter a valid option (# 1-5)\n");
				printMenu();
				break;
			}
			input = sc.nextLine();
		}
	}
	
	public static void printLibrary() {
		for (int i = 0; i < myLibrary.size(); i++) {
			if (myLibrary.get(i).getCheckOut().equalsIgnoreCase("true")) {
				myLibrary.get(i).printBook(" (x)");
			} else {
				myLibrary.get(i).printBook();
			}
		}
		System.out.println();
		System.out.println("(x) = Book is checked out\n");
		getCheckOut();
	}
	
	public static void printSearchMenu() {

		System.out.println(" Search By:");
		System.out.println("1 - Genre");
		System.out.println("2 - Title");
		System.out.println("3 - Author Last Name");
		System.out.println("4 - Author First Name");
		System.out.println("5 - Keyword");
		System.out.println("6 - Main Menu");
		System.out.print("\nEnter menu number: ");

		searchMenu();
	}

	public static void searchMenu() {
		String x = sc.nextLine();
		switch (x) {
		case "1":
			searchGenre();
			break;
		case "2":
			searchTitle();
			break;
		case "3":
			searchLastName();
			break;
		case "4":
			searchFirstName();
			break;
		case "5":
			searchKeyWord();
			break;
		case "6":
			printMenu();
			break;
		default:
			System.out.println("Please nter a valid option (# 1-6)\n");
			printSearchMenu();
			break;
		}
	}

	public static String numToGenre(int x) {
		String userInput = "";
		switch (x) {
		case 1:
			userInput = "Nonfiction";
			break;
		case 2:
			userInput = "Fiction";
			break;
		case 3:
			userInput = "Childrens";
			break;
		case 4:
			userInput = "Reference";
			break;
		}
		return userInput;
	}

	public static void searchGenre() {

		System.out.println("1.Nonfiction\n2.Fiction");
		System.out.println("3.Childrens\n4.Reference\n");
		System.out.print("What category are you interested in? (enter # 1-4): ");
		int x = Validator.getValidInt(1, 4);
		sc.nextLine();
		String userInput = numToGenre(x);
		ArrayList<String> alpha = new ArrayList<String>();
		for (int i = 0; i < myLibrary.size(); i++) {
			if (myLibrary.get(i).getGenre().equalsIgnoreCase(userInput)) {

				if (myLibrary.get(i).getCheckOut().equalsIgnoreCase("true")) {
					alpha.add(myLibrary.get(i).getBook(" (x)"));
				} else {
					alpha.add(myLibrary.get(i).getBook());
				}
			}
		}
		String[] alphaArray = new String[alpha.size()];
		alpha.toArray(alphaArray);
		Arrays.sort(alphaArray);

		for (int i = 0; i < alphaArray.length; i++) {
			System.out.println(alphaArray[i]);
		}
		if (alphaArray.length > 0) {
			getCheckOut();
		} 
	}

	public static void searchLastName() {
		System.out.print("Please enter Author last name: ");
		String userInput = sc.nextLine();

		ArrayList<String> alpha = new ArrayList<String>();
		for (int i = 0; i < myLibrary.size(); i++) {
			if (myLibrary.get(i).getLastName().equalsIgnoreCase(userInput)) {

				if (myLibrary.get(i).getCheckOut().equalsIgnoreCase("true")) {
					alpha.add(myLibrary.get(i).getBook(" (x)"));
				} else {
					alpha.add(myLibrary.get(i).getBook());
				}
			}
		}
		String[] alphaArray = new String[alpha.size()];
		alpha.toArray(alphaArray);
		Arrays.sort(alphaArray);

		for (int i = 0; i < alphaArray.length; i++) {
			System.out.println(alphaArray[i]);
		}
		if (alphaArray.length > 0) {
			getCheckOut();
		} else {
			System.out.println("Entry not found! Try again?(y/n)");
			String continueKeyword = sc.nextLine();
			if (continueKeyword.equalsIgnoreCase("y")) {
				searchLastName();
			} else {
				searchMenu();
			}
		}
	}

	public static void searchFirstName() {
		System.out.print("Please enter Author first name: ");
		String userInput = sc.nextLine();

		ArrayList<String> alpha = new ArrayList<String>();
		for (int i = 0; i < myLibrary.size(); i++) {
			if (myLibrary.get(i).getFirstName().equalsIgnoreCase(userInput)) {

				if (myLibrary.get(i).getCheckOut().equalsIgnoreCase("true")) {
					alpha.add(myLibrary.get(i).getBook(" (x)"));
				} else {
					alpha.add(myLibrary.get(i).getBook());
				}
			}
		}
		String[] alphaArray = new String[alpha.size()];
		alpha.toArray(alphaArray);
		Arrays.sort(alphaArray);

		for (int i = 0; i < alphaArray.length; i++) {
			System.out.println(alphaArray[i]);
		}
		if (alphaArray.length > 0) {
			getCheckOut();
		} else {
			System.out.println("Entry not found! Try again?(y/n)");
			String continueKeyword = sc.nextLine();
			if (continueKeyword.equalsIgnoreCase("y")) {
				searchFirstName();
			} else {
				searchMenu();
			}
		}
	}

	public static void searchTitle() {
		System.out.print("Please enter Book Title: ");
		String userInput = sc.nextLine();

		ArrayList<String> alpha = new ArrayList<String>();
		for (int i = 0; i < myLibrary.size(); i++) {
			if (myLibrary.get(i).getTitle().equalsIgnoreCase(userInput)) {

				if (myLibrary.get(i).getCheckOut().equalsIgnoreCase("true")) {
					alpha.add(myLibrary.get(i).getBook(" (x)"));
				} else {
					alpha.add(myLibrary.get(i).getBook());
				}
			}
		}
		String[] alphaArray = new String[alpha.size()];
		alpha.toArray(alphaArray);
		Arrays.sort(alphaArray);

		for (int i = 0; i < alphaArray.length; i++) {
			System.out.println(alphaArray[i]);
		}
		if (alphaArray.length > 0) {
			getCheckOut();
		} else {
			System.out.println("Entry not found! Try again?(y/n)");
			String continueKeyword = sc.nextLine();
			if (continueKeyword.equalsIgnoreCase("y")) {
				searchTitle();
			} else {
				searchMenu();
			}
		}
	}

	public static void searchKeyWord() {
		System.out.print("Please enter Keyword: ");
		String userInput = sc.nextLine();
		userInput = userInput.toUpperCase();

		ArrayList<String> alpha = new ArrayList<String>();
		for (int i = 0; i < myLibrary.size(); i++) {
			if (myLibrary.get(i).getTitle().toUpperCase().contains(userInput))
				alpha.add(myLibrary.get(i).getBook());
			if (myLibrary.get(i).getLastName().toUpperCase().contains(userInput))
				alpha.add(myLibrary.get(i).getBook());
			if (myLibrary.get(i).getGenre().toUpperCase().contains(userInput))
				alpha.add(myLibrary.get(i).getBook());
			if (myLibrary.get(i).getFirstName().toUpperCase().contains(userInput))
				alpha.add(myLibrary.get(i).getBook());
		}

		String[] alphaArray = new String[alpha.size()];
		alpha.toArray(alphaArray);
		Arrays.sort(alphaArray);

		for (int i = 0; i < alphaArray.length; i++) {
			System.out.println(alphaArray[i]);
		}
		if (alphaArray.length > 0) {
			getCheckOut();
		} else {
			System.out.println("Entry not found! Try again?(y/n)");
			String continueKeyword = sc.nextLine();
			if (continueKeyword.equalsIgnoreCase("y")) {
				searchKeyWord();
			} else {
				searchMenu();
			}
		}
	}

	public static void getBookcart() {
		for (Book p : checkOut)
			System.out.println(p.getBook());
		System.out.println();
		printMenu();
	}
	
	public static void generateRandomBook() {
		Random r = new Random();
		System.out.print("Do you feel lucky?(y/n):");
		String yOrN = sc.nextLine();

		while (yOrN.equalsIgnoreCase("y")) {
			int x = r.nextInt(myLibrary.size());

			System.out.println("\n" + myLibrary.get(x).getBook());

			checkOut.add(myLibrary.get(x));
			System.out.println("This book has been added to your cart!");
			System.out.println("Checkout another book? (y/n):");
			yOrN = sc.nextLine();
		}
		printMenu();
	}

	public static void addtoCheckoutReceipt() {

		Path usernamePath = Paths.get(username + ".txt");
		File usernameFile = usernamePath.toFile();

		try {
			FileWriter fw = new FileWriter(usernameFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);

			for (Book p : checkOut) {
				out.println(p.getBook());
				System.out.println("You checked out " + p.getBook());
			}

			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getCheckOut() {
		System.out.print("\nWould you like to check out one of these books? (y/n):");
		String yOrN = Validator.readYorN("y", "n");
		if (yOrN.equalsIgnoreCase("y")) {
			System.out.print("Please enter the TITLE of the book you want to checkout: ");

			String input = sc.nextLine();

			for (int i = 0; i < myLibrary.size(); i++) {
				if (myLibrary.get(i).getTitle().equalsIgnoreCase(input)
						&& myLibrary.get(i).getCheckOut().equalsIgnoreCase("true")) {
					System.out.print(
							"That book is already checked out sugar dumpling. Would you like to try it again?(y/n)");
					yOrN = Validator.readYorN("y", "n");
					if(yOrN.equalsIgnoreCase("y"))
						getCheckOut();
				}
				if (myLibrary.get(i).getTitle().equalsIgnoreCase(input)
						&& myLibrary.get(i).getCheckOut().equalsIgnoreCase("false")) {
					checkOut.add(myLibrary.get(i));
					myLibrary.get(i).setCheckOut("true");
				}

			addtoCheckoutReceipt();
			System.out.print("Checkout another book? (y/n)");
			yOrN = Validator.readYorN("y", "n");
			}
		}else
		printSearchMenu();
		
	}

	public static void main(String[] args) {
		myLibrary = Library.getLibrary();
		welcomeMenu();
		printMenu();
		sc.close();
	}
}
