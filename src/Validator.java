//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Scanner;
//
//public class Validator {
////	String s = "BilJaGanyLibrary";
////	String username = "filename";
////	try
////	{
////		
////		File dir = new File("logs/" + s);
////		dir.mkdirs();
////		File permfile = new File(dir + username + ".txt");
////		permfile.createNewFile();
////	}catch(
////	Exception e)
////	{
////		e.printStackTrace();
////	}
////
////	//
//	static Scanner sc = new Scanner(System.in);
//
//	public static void writeToFile() {
//		String username;
//		 
//		
//		Path usernamePath = Paths.get(username+".txt");
//		File usernameFile = usernamePath.toFile();
//		
//		try 
//		{
//			FileWriter fw = new FileWriter(usernameFile, true);
//			BufferedWriter bw = new BufferedWriter(fw);
//			PrintWriter out = new PrintWriter(bw);
//			
//			//String bookCheckedOut=sc.nextLine();
//			for (Book x:checkOut)
//			out.println(x);
//			
//			
//			out.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}}
