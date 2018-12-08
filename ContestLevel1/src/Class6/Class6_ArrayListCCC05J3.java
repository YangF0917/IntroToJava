package Class6;
import java.util.*;
public class Class6_ArrayListCCC05J3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> dir = new ArrayList<String>();
		String str = sc.next();
		String loc = "";
		while (!str.equals("SCHOOL")) {
			dir.add(str);
			str = sc.next();
		}
		for (int i = dir.size()-1; i >= 0; i--) {
			if (dir.get(i).equals("L") && i == 0) {
				System.out.println("Turn RIGHT into your HOME.");
			}
			else if (dir.get(i).equals("R") && i == 0) {
				System.out.println("Turn LEFT into your HOME.");
			}
			else if (dir.get(i).equals("L")) {
				System.out.println("Turn RIGHT onto "+ dir.get(i-1) + " street.");
			}
			else if (dir.get(i).equals("R")){
				System.out.println("Turn LEFT onto " + dir.get(i-1) + " street.");
			}
		}
	}

}
