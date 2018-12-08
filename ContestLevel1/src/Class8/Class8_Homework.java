package Class8;
import java.util.*;
public class Class8_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		// Testing the methods:
		monthName(5);
		monthDays(2);
		swap(3,7);
		realTime(6342);
		System.out.println(Arrays.toString(upper(new String [] {"hello", "HELLO", "HeLlO"})));
		System.out.println(Arrays.toString(randomize(new int []{2,4,6,8})));
		System.out.println(Arrays.toString(reverse(new int [] {1,2,3,4,5,6,7,8,9,10})));
		System.out.println(Arrays.toString(insertValue(new int [] {1,2,3,4,5}, 100, 2)));
		System.out.println(sum(new int []{1,2,3}));
		System.out.println(average(new int[] {1,2,4}));
		System.out.println(findMax(new int[] {-5, 7, 100, -100, 99, -1001}));
		System.out.println(sumEven(new int[] {2,8,1001,1,3,5,7,9}));
		System.out.println(allPositive(new int[] {1,2,3,4,5,6,7,8,9,-1}));
		System.out.println(isPalindrome("racecar"));
	}
	// Problem 1
	public static void monthName(int x) {
		String [] months = {"January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};
		System.out.println(months[x - 1]);
	}
	// Problem 2
	public static void monthDays(int x) {
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(days[x - 1]);
	}
	// Problem 3
	public static void swap(int a, int b) {
		System.out.println(b + " " + a);
	}
	// Problem 4
	public static void realTime(int x) {
		System.out.println("Hours: " + x / 3600);
		System.out.println("Minutes: " + (x % 3600)/60);
		System.out.println("Seconds: " + (x % 60));
	}
	// Problem 5
	public static String[] upper(String [] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i].toUpperCase();
		}
		return a;
	}
	// Problem 6
	public static int[] randomize(int [] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*90 + 10);
		}
		return a;
	}
	// Problem 7
	public static int[] reverse(int [] a) {
		for (int i = 0; i < ((a.length)/2); i++) {
			int temp = a[a.length-1-i];
			a[a.length-1-i] = a[i];
			a[i] = temp;
		}
		return a;
	}
	// Problem 8
	public static int[] insertValue(int[] x, int a, int b) {
		int temp2 = a;
		for (int i = b; i < x.length; i++) {
			int temp = x[i];
			x[i] = temp2;
			temp2 = temp;
		}
		return x;
	}
	// Problem 9 and 10
	public static int sum (int [] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum;
	}
	// Problem 11
	public static double average(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum/(double)a.length;
	}
	// Problem 12 and 13
	public static int findMax(int [] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) max = a[i];
		}
		return max;
	}
	// Problem 14
	public static int sumEven(int []a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) sum += a[i];
		}
		return sum;
	}
	// Problem 15
	public static boolean allPositive(int []a) {
		boolean isPos = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) isPos = false;
		}
		return isPos;
	}
	// Problem 16
	public static boolean isPalindrome(String x) {
		boolean isP = true;
		for (int i = 0; i < (x.length()/2); i++) {
			if (x.charAt(i) != x.charAt(x.length()-i-1)) isP = false;
		}
		return isP;
	}
	
}
