package Class10;
import java.util.*;
public class Class10_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(sum(10));
		int a = sc.nextInt();
		System.out.println(nproduct(5));
		System.out.println(fibonacci(a));
		System.out.println(deciToBin(5));
		System.out.println(isPalindrome("wasitacatisaw"));
	}
	public static int sum(int x) {
		if (x > 0) return x + sum(x-1);
		else return x;
	}
	/**
	 * Factorial
	 * @param x positive integer
	 * @return product of first n integers
	 */
	public static int nproduct(int x) {
		if (x > 0) return x * nproduct(x-1);
		else return 1;
	}
	/**
	 * Fibonacci sequence
	 * @param x Positive integer
	 * @return xth fibonacci term
	 */
	public static int fibonacci (int x) {
		if (x == 1) return 1;
		else if(x == 2) return 1;
		else return fibonacci(x-2) + fibonacci(x-1);
	}
	public static String deciToBin(int x) {
		if (x == 0) return "0";
		else if (x == 1) return "1";
		else return deciToBin(x-1) + deciToBin(x-2);
	}
	public static boolean isPalindrome (String str) {
		//wasitacatisaw
		if (str.length() == 1 || str.length() == 0) return true;
		else if (str.charAt(0) == str.charAt(str.length()-1)) return isPalindrome(str.substring(1, str.length()-1));
		return false;
	}
}
