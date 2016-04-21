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

public class libraryApp {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Book> myLibrary;
	static ArrayList<Book> checkOut = new ArrayList<Book>();
	static String username;

	public static void optionMenu() {
		String input = sc.nextLine();
		while (true) {

			switch (input) {
			case "1":
				printLibrary();
				break;
			case "2":
				printSearchMenu();
				String x = sc.nextLine();
				searchMenu(x);
				break;
			case "3":
				for (Book p : checkOut)
					System.out.println(p.getBook());
				break;
			case "4":
				generateRandomBook();
				break;
			case "5":
				System.out.println("Goodbye!");
				return; 
			default:
				System.out.println("Enter a valid option, you peasant.\n");
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
				// this prints all info on each book NEED METHOD
				myLibrary.get(i).printBook();
			}
		}
		System.out.println();
		System.out.println("(x)=Book is checked out\n");
		getCheckOut();
	}

	public static void printMenu() {
		System.out.println("Hey " + username + " this is the Main Menu:");
		System.out.println("1 - See Entire Catalog");
		System.out.println("2 - Search");
		System.out.println("3 - Bookcart");
		System.out.println("4 - BilJaGamy's Picks");
		System.out.println("5 - Exit");
		System.out.print("\nEnter menu number: ");
		optionMenu();
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
	}

	public static void searchMenu(String x) {
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
			System.out.println("Enter a valid option, you peasant.\n");
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
		int x = sc.nextInt();
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
		getCheckOut();
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

		getCheckOut();
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

		getCheckOut();

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

		getCheckOut();
	}

	public static void searchKeyWord() {
		System.out.print("Please enter Keyword: ");
		String userInput = sc.nextLine();

		ArrayList<String> alpha = new ArrayList<String>();
		for (int i = 0; i < myLibrary.size(); i++) {
			if (myLibrary.get(i).getTitle().contains(userInput)) {

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

		getCheckOut();

	}

	public static void addtoCheckoutReceipt() {

		Path usernamePath = Paths.get(username + ".txt");
		File usernameFile = usernamePath.toFile();

		try {
			FileWriter fw = new FileWriter(usernameFile, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);

			// out.println("BilJaGany Book Log!!!");
			// out.println("Below is a List of the Books you have checked
			// out:\n");

			for (Book p : checkOut) {
				out.println(p.getBook());
				System.out.println("You checked out " + p.getBook());
			}

			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void generateRandomBook() {
		System.out.print("Do you feel lucky? (y/n):  ");
		String yOrN = sc.nextLine();

		Random r = new Random();

		while (yOrN.equalsIgnoreCase("y")) {
			int x = r.nextInt(myLibrary.size());
			System.out.println("\n" + myLibrary.get(x).getBook());

			checkOut.add(myLibrary.get(x));
			System.out.println("This book has been added to your cart!");
			System.out.println("Checkout another book? (y/n)");
			yOrN = sc.nextLine();
		}
		printMenu();
	}

	public static void getCheckOut() {
		System.out.println("\nWould you like to check out one of these books? (y/n):");
		String yOrN = sc.nextLine();
		while (yOrN.equalsIgnoreCase("y")) {
			System.out.print("Please enter the title of the book you want to checkout: ");

			String input = sc.nextLine();

			for (int i = 0; i < myLibrary.size(); i++) {
				if (myLibrary.get(i).getTitle().equalsIgnoreCase(input))
					checkOut.add(myLibrary.get(i));
				myLibrary.get(i).setCheckOut("true");
			}
			addtoCheckoutReceipt();
			System.out.println("Checkout another book? (y/n)");
			yOrN = sc.nextLine();
		}
		printSearchMenu();
		String x = sc.nextLine();
		searchMenu(x);

	}

	public static void main(String[] args) {
		myLibrary = Library.getLibrary();

		System.out.println("Welcome to the best library in the world!");
		System.out.println("Full of the rarest books in creation\n");
		System.out.println("THE BILJAGANY LIBRARY!!!!\n");
		System.out.println("What is your name?");
		username = sc.nextLine();

		printMenu();

	}
}
