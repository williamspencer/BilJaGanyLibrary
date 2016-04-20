import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Library 
{
 
public static ArrayList<Book> getLibrary() {
	ArrayList<Book> myLibrary= new ArrayList<>();

	Path librariesPath = Paths.get("library.txt");
	File librariesFile = librariesPath.toFile();
	try {
	FileReader r = new FileReader(librariesFile);
	BufferedReader in = new BufferedReader( r);
	String line = in.readLine();
	while (line !=null)
	{
		String delims = "[,]";
		String[] list = line.split(delims);
		myLibrary.add(new Book(list[0],list[1],list[2],list[3],list[4]));
		
	
	line = in.readLine();
	}
	in.close();
	}
	catch (IOException e)
	{
	System.out.println(e);
	}
	return myLibrary;

}
}
