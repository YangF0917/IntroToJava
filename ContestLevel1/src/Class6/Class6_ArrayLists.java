package Class6;
import java.util.*;
public class Class6_ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		// Declaring an ArrayList
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<String> str = new ArrayList<String>();
		
		// Adding a value to the arraylist
		num.add(10);
		System.out.println(num);
		
		// Adding to a specific index
		num.add(0,12);
		num.add(2,13);
		System.out.println(num);
		
		// Size of an Arraylist
		System.out.println(num.size());
		
		// IsEmpty
		System.out.println(num.isEmpty());
		
		// IndexOf and Element
		System.out.println(num.indexOf(12));
		
		// Removing an element
		num.remove(0);
		System.out.println(num);
		
		// Changing the value of a specified index
		num.set(0, -100);
		System.out.println(num);
		
		// For loop to initialize
		for (int i = 0; i < 5; i++) {
			int x = sc.nextInt();
			num.add(x);
		}
		
		// Printing using for loop
		// .get(index) method prints out the value at that index
		for (int i = 0; i < num.size(); i++){
			System.out.print(num.get(i) + " ");
		}
		System.out.println("");
		*/
		
		// ArrayList Practice
		ArrayList<String> name = new ArrayList<String>();
		name.add("cat");
		name.add("cat");
		name.add("cow");
		name.add("lion");
		name.add("tiger");
		name.add("cat");
		name.add("elephant");
	
		for (int i = 0; i < name.size(); i++) {
			while (name.get(i).equals("cat")) name.remove(i);
		}
		for (int i = 0; i < name.size(); i++) {
			System.out.print(name.get(i) + " ");
		}
	}

}
