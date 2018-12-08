package Class20;
import java.io.*;
public class SpamVirus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// ppt, docx, txt, xls
			int counter = 0;
			// DO NOT RUN
			/*
			while (counter < Long.MAX_VALUE) {
				FileWriter fw = new FileWriter("foo"+counter+".ppt");
				PrintWriter pw = new PrintWriter(fw);
				pw.println("Hello World");
				pw.close();
				counter++;
			}
			*/
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String c = br.readLine();
		}
		catch(IOException e) {}
	}

}
