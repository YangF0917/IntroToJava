package Class18;
import java.util.*;

public class Class18_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap <Integer, Integer> fav = new HashMap<>(); 
		for (int i = 0; i < n; i++) {
			int favNum = sc.nextInt();
			if (fav.containsKey(favNum)) fav.put(favNum, fav.get(favNum) + 1);
			else fav.put(favNum, 1);
		}
		int q = sc.nextInt();
		String out = "";
		for (int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int max = Integer.MAX_VALUE;
			for (int b: fav.keySet()) {
				if (b >= a && b < max) max = b;
			}
			out += max + " " + fav.get(max) + "\n";
		}
		System.out.println(out);
	}

}
