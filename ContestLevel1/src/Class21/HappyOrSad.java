package Class21;
import java.io.*;
public class HappyOrSad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("happyorsad.txt");
			BufferedReader br = new BufferedReader(fr);
			String user = br.readLine();
			int happy = 0, sad = 0;
			for (int i = 0; i < user.length(); i++) {
				if (user.charAt(i) == ':' && i + 2 < user.length()) {
					if (user.charAt(i+1) == '-') {
						if (user.charAt(i+2) == ')') happy++;
						else if (user.charAt(i+2) == '(') sad++;
					}
				}
			}
			if (happy == 0 && sad == 0) System.out.println("none");
			else if (happy == sad) System.out.println("unsure");
			else if (happy > sad) System.out.println("happy");
			else System.out.println("sad");
		}
		catch (IOException e) {}
	}

}
