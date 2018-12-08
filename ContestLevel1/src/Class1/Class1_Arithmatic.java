package Class1;
import java.util.Scanner;

public class Class1_Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		
		// String addition
		System.out.println(3 + 4 + "a");
		System.out.println("a" + 3 + 4);
		System.out.println(3 + 4);
		System.out.println("a" + 3 + 4 + "a");
		
		System.out.println(8 - 7);
		
		System.out.println(5 / 9);
		
		System.out.println(7 * 9);
		
		// 30 cents split using modulus
		System.out.println(30 / 25 + " Quarter(s)");
		System.out.println(30 % 25 / 10 + " Dime(s)");
		System.out.println(30 % 25 % 10 / 5 + " Nickel(s)");
		
		
		// Casting a calculation to integer
		System.out.println(Math.sqrt(100));
		System.out.println((int)Math.sqrt(56));
		
		System.out.println(Math.pow(2, 10));
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		// Combining numbers with Strings
		System.out.println("Sum: " + (2 + 3));
		
		System.out.println(Math.sin(0));
		System.out.println(Math.round(9.7));
	}

}
