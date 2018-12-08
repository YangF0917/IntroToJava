package Class21;
import java.util.*;
public class Class21_Homework {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String nll = sc.nextLine();
		String [] letter = new String [n];
		String [] binary = new String [n];
		for (int i = 0; i < n; i++) {
			letter[i] = sc.next();
			binary[i] = sc.next();
		}
		String seq = sc.next();
		String temp = "";
		while (!seq.equals("")) {
			for (int i = 0; i < n; i++) {
				int index = seq.indexOf(binary[i]);
				while (index >= 0) {
					temp = temp + letter[i];
					seq = seq.substring(index + binary[i].length());
					index = seq.indexOf(binary[i]);
				}
			}
		}
		System.out.println(temp);
	}

}
