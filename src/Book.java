
public class Book {
		
		private String title;
		private String lastName;
		private String firstName;
		private String genre;
		private boolean checkOut = false;
		
		public Book(String a, String b, String c, String d, boolean x){
			genre = a;
			title = b;
			firstName = c;
			lastName = d;
			checkOut = x;
		}
		public Book(String a, String b, String c, String d){
			genre = a;
			title = b;
			firstName = c;
			lastName = d;
		}
}
