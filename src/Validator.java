import java.util.Scanner;
public class Validator {
	static Scanner scan = new Scanner(System.in);
	// Validates that input is an integer value
	public static int readValidInt() {
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.print("Please enter a valid number: ");
		}
		int x = scan.nextInt();
		scan.nextLine();
		return x;
	}
	// Validates that input is within the range you set.  Will need to be called in main.
	public static int getValidInt(int min, int max) {
		int i = readValidInt();
		while (i < min || i > max) {
			System.out.print("Please put a number within range! (1-6): ");
			i = readValidInt();
		}
		return i;
	}
	
	// Validates that input is an double value
	public static double readValidDouble() {
		while (!scan.hasNextDouble()) {
			scan.nextLine();
			System.out.print("Please enter a valid number: ");
		}
		double x = scan.nextDouble();
		scan.nextLine();
		return x;
	}
	
	// Validates that input is within the range you set.  Will need to be called in main.
	public static double getValidDouble(double min, double max) {
		double i = readValidDouble();
		while (i < min || i > max) {
			System.out.print("Please put a number within range! (1-6): ");
			i = readValidDouble();
		}
		return i;
	}
	
	public static float readValidFloat() {
		while (!scan.hasNextFloat()) {
			scan.nextLine();
			System.out.print("Please enter a valid number: ");
		}
		float x = scan.nextFloat();
		scan.nextLine();
		return x;
	}
	// Validates that input is within the range you set.  Will need to be called in main.
	public static float getValidFloat(float min, float max) {
		float i = readValidFloat();
		while (i < min || i > max) {
			System.out.print("Please put a number within range! (1-6): ");
			i = readValidFloat();
		}
		return i;
	}
	
	public static short readValidShort() {
		while (!scan.hasNextShort()) {
			scan.nextLine();
			System.out.print("Please enter a valid category #: ");
		}
		short x = scan.nextShort();
		scan.nextLine();
		return x;
	}
	// Validates that input is within the range you set.  Will need to be called in main.
	public static short getValidShort(short min, short max) {
		short i = readValidShort();
		while (i < min || i > max) {
			System.out.print("Please put a number within range! (1-6): ");
			i = readValidShort();
		}
		return i;
	}
	
	public static long readValidLong() {
		while (!scan.hasNextLong()) {
			scan.nextLine();
			System.out.print("Please enter a valid category #: ");
		}
		long x = scan.nextLong();
		scan.nextLine();
		return x;
	}
	// Validates that input is within the range you set.  Will need to be called in main.
	public static long getValidLong(long min, long max) {
		long i = readValidLong();
		while (i < min || i > max) {
			System.out.print("Please put a number within range! (1-6): ");
			i = readValidLong();
		}
		return i;
	}
	
	public static byte readValidByte() {
		while (!scan.hasNextByte()) {
			scan.nextLine();
			System.out.print("Please enter a valid category #: ");
		}
		byte x = scan.nextByte();
		scan.nextLine();
		return x;
	}
	
		// Validates that input is within the range you set.  Will need to be called in main.
	public static byte getValidByte(byte min, byte max) {
		byte i = readValidByte();
		while (i < min || i > max) {
			System.out.print("Please put a number within range! (1-6): ");
			i = readValidByte();
		}
		return i;
	}
	
	public static char readValidChar() {
		   char letter = scan.next().charAt(0);
	        if (Character.toString(letter).matches("^[a-zA-Z0-9]*$")) {
	            System.out.println("Thank you");
	        } else {
	            System.out.println("Invalid input");
	        }
	        return letter;
	}
	// Validates an input of "y" or "n" regardless of case.
	public static String readYorN(String x, String y) {
		String z = scan.nextLine();
		while (!(z.equalsIgnoreCase(x) || z.equalsIgnoreCase(y))) {
			System.out.print("Invalid option, use 'y' or 'n': ");
			z = scan.nextLine();
		}
		return z;
	}
}