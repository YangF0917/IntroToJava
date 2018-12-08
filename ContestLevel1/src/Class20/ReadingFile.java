package Class20;
import java.io.*;
public class ReadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("j1.1.in");
			BufferedReader br = new BufferedReader(fr);
			String line;
			line = br.readLine();
			while (line != null) {
				/*
				int a1 = Integer.parseInt(line.split(" ")[0]);
				int a2 = Integer.parseInt(line.split(" ")[1]);
				*/
				System.out.println(Integer.parseInt(line) * 2);
				line = br.readLine();
			}
			br.close();
		}
		catch (IOException e) {}
	}

}
