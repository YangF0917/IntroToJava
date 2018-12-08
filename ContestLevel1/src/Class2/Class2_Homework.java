package Class2;
import java.util.*;
public class Class2_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Question 1:

		for (int i = 100; i <= 999; i++) {
		int b = Integer.parseInt((Integer.toString(i).substring(0, 1)));
		int c = Integer.parseInt((Integer.toString(i).substring(1, 2)));
		int d = Integer.parseInt((Integer.toString(i).substring(2)));
		if (b*b*b + c*c*c + d*d*d == i) {
			System.out.println(i + " ");
		}
		}
		
		
		
		// Question 2:
		int n = sc.nextInt();
		int factorial = 1;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j > 0; j--) {
				factorial*=j;
			}
			sum += factorial;
			factorial = 1;
		}
		System.out.println(sum);
	}
}
