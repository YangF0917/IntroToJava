package Class3;
import java.util.Scanner;
public class Class3_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Greatest Common Divisor & Least Common Multiple
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = 1;
		
		for (int i = a; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println(i);
				gcd = i;
				break;
			}
		}
		System.out.println(a * b / gcd);
		
		// Prime Number
		for (int i = 100; i <= 200; i++) {
			int factors = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					factors++;
				}
			}
			if (factors == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
		
		// Perfect Number
		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			String factors = "";
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
					factors += j + " ";
				}
			}
			if (sum == i) System.out.println(i + " has factors " +factors);
		}
		System.out.println("");
		
		// Diamond Pattern
		int n = sc.nextInt();
		/*
		 *   *   
		 *  ***  
		 * *****
		 *  *** 
		 *   *
		 */
		if (n % 2 == 1){
			for (int i = n/2; i >=0; i--) {
				for (int j = 0; j<= i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (n/2-i)*2 +1; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			for (int i = 1; i <= n/2; i++) {
				for (int j = 0; j<= i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (n/2-i)*2 +1; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		/*
		 *   ** 
		 *  ****
		 * ******
		 * ******
		 *  ****
		 *   **
		 */
		else {
			for (int i = n/2; i >= 0; i--) {
				for (int j = 0; j<= i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (n/2-i)*2; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			for (int i = 0; i <= n/2; i++) {
				for (int j = 0; j<= i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= (n/2-i)*2; k++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
