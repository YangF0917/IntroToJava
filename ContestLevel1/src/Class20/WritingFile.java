package Class20;
import java.io.*;
import java.util.*;
public class WritingFile {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Writing into a file
		try
		{
			// ppt, docx, txt, xls
			FileWriter fw = new FileWriter("foo.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Hello1");
			pw.println("World1");
			pw.close();
		}
		catch(IOException e) {}
	}

}
