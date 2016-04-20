

public class Book {
		
		private String title;
		private String lastName;
		private String firstName;
		private String genre;
		private String checkOut;
		
		public Book(String a, String b, String c, String d, String x){
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
