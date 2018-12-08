package Class8;
import java.util.*;
public class Class8_Methods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Calling a method
		System.out.println(intsum(1, 7));
		int sum = intsum(7,9);
		System.out.println(sum);
		
		System.out.println(isPrime(8));
		
	}
	// Creating a method
	public static int intsum(int a, int b) {
		return a+b;
	}
	public static boolean isEven (int x) {
		/*
		if (x % 2 == 0) return true;
		else return false;
		*/
		return x % 2 == 0;
	}
	public static boolean isPrime (int x) {
		int count = 0;
		for (int i = 1; i <= x; i++) if (x % i == 0) count++;
		return count == 2;
	}
}
