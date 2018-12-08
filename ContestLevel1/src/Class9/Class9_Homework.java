package Class9;
import java.util.*;
public class Class9_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int nTest = sc.nextInt();
		for (int i = 0; i < nTest; i++) {
			Map <Integer, Integer> myMap = new HashMap <Integer, Integer>();
			int nflakes = sc.nextInt();
			for (int j = 0; j < nflakes; j++) {
				int size = sc.nextInt();
				if (myMap.containsKey(size)) myMap.put(size, myMap.get(size) + 1);
				else myMap.put(size, 1);
			}
			System.out.println(myMap.size());
		}
	}

}
