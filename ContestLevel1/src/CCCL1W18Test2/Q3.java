package CCCL1W18Test2;
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String output = "";
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int k = sc.nextInt();
			HashMap<String, Integer> f = new HashMap<>();
			String temp = sc.nextLine();
			for (int j = 0; j < m; j++) {
				String user = sc.nextLine();
				if (f.containsKey(user)) {
					f.put(user, f.get(user) + 1);
				}
				else f.put(user, 1);
			}
			ArrayList<Integer> o = new ArrayList<>();
			for (String s: f.keySet()) {
				if (!o.contains(f.get(s))) o.add(f.get(s));
			}
			o.sort(null);
			if (k == 1) output += "1st most common word(s):" + "\n";
			else if (k == 2) output += "2nd most common word(s):" + "\n";
			else if (k == 3) output += "3rd most common word(s):" + "\n";
			else output += "" + k + "th most common word(s):" + "\n";
			if (k <= o.size()) {
				int occuranceFind = o.get(k - 1);
				for (String s: f.keySet()) {
					if (f.get(s) == occuranceFind) output += s + "\n";
				}
			}
			output += "\n";
		}
		System.out.println(output);
	}

}
