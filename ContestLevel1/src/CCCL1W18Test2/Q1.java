package CCCL1W18Test2;
import java.util.*;
public class Q1 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String output = "";
		int k = sc.nextInt();
		String temp = sc.nextLine(); // Useless
		String user = sc.nextLine();
		for (int i = 0; i < k; i++) {
			output += user.charAt(i);
		}
		for (int i = k; i < user.length(); i++) {
			HashMap<Character, Integer> letters = new HashMap<>();
			for (int j = i-5; j < i; j++) {
				if (letters.containsKey(user.charAt(j))) {
					letters.put(user.charAt(j), letters.get(user.charAt(j)) + 1);
				}
				else letters.put(user.charAt(j), 1);
			}
			char most = '{';
			int max = Integer.MIN_VALUE;
			for (char c: letters.keySet()) {
				if (letters.get(c) > max) {
					most = c;
					max = letters.get(c);
				}
				else if (letters.get(c) == max) {
					if ((int)c < (int)most) most = c;
				}
			}
			int shift = (int)most - 96;
			if ((int)user.charAt(i) + shift > 122) output += (char)((int)user.charAt(i) + shift - 26);
			else output += (char)((int)user.charAt(i) + shift);
		}
		System.out.println(output);
		
	}
}
