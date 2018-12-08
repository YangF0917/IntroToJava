package Class9;
import java.util.*;
// java.util.Set;
// java.util.HashSet;
public class Class9_HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String temp = sc.nextLine();
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			printFrequent(str.replaceAll(" ", "").toLowerCase());
		}
		HashMap <Integer,String> dictionary = new HashMap<>();
		
		// put() function
		
		// get() function
		
		// Letter Frequencies
		
	}
	public static void printFrequent(String x) {
		Map<Character, Integer> mymap = new HashMap<Character, Integer>();
		for (int i = 0; i < x.length(); i++) {
			if (mymap.containsKey(x.charAt(i))) {
				mymap.put(x.charAt(i),mymap.get(x.charAt(i)) + 1);
			}else {
				mymap.put(x.charAt(i), 1);
			}
		}
		
		String temp = "";
		int max = 0;
		for (char k : mymap.keySet()) {
			if (mymap.get(k) >= max) {
				max = mymap.get(k);
			}
		}
		for (char k : mymap.keySet()) {
			if (mymap.get(k) == max) temp += k;
		}
		temp = temp.toUpperCase();
		for (int i = 0; i < temp.length(); i++) {
			System.out.print(temp.charAt(i) + " ");
		}
		System.out.println("Occurs " + max + " times.");
	}

}
