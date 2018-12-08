package Class21;
import java.io.*;
public class DoubleDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		try {
			fr = new FileReader("doubledice.txt");
			BufferedReader br = new  BufferedReader(fr);
			String line = br.readLine();
			int AS = 100; int DS = 100;
			int nRolls = Integer.parseInt(line);
			for (int i = 0; i < nRolls; i++) {
				line = br.readLine();
				int as = Integer.parseInt(line.split(" ")[0]);
				int ds = Integer.parseInt(line.split(" ")[1]);
				if (as > ds) {
					DS -= as;
				}
				else if (ds > as) {
					AS -= ds;
				}
			}
			System.out.println(AS + "\n" + DS);
			br.close();
		}
		catch (IOException e) {}
	}

}
