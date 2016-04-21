

public class Book {
		
		private String title;
		private String lastName;
		private String firstName;
		public void printBook(String x)
		{ 
			System.out.println("\""+getTitle()+"\""+", by "+ getFirstName()+" "+getLastName() + x);
		}
		
		public void printBook()
		{
			System.out.println("\""+getTitle()+"\""+", by "+ getFirstName()+" "+getLastName());
		}
		public void printTitle(){
			System.out.println(getTitle());
		}
		public String getTitle() {
			return title;
		}
		public String getLastName() {
			return lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getBook() {
			return title + " By: " + firstName + " " + lastName;
		}
		public String getGenre() {
			return genre;
		}
		public String getCheckOut() {
			return checkOut;
		}
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
