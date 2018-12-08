package Class1;
import java.util.Scanner;
public class Class1_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		//QUESTION 1
		double x = sc.nextInt();
		if (x < 1) System.out.println((int)x);
		else if(x >= 10) System.out.println((int)3*x-11);
		else System.out.println((int)2*x-1);
		
		//QUESTION 2
		
		int calories = 0;
		int [] burger = {461, 431, 420, 0};
		int [] drink = {130, 160, 118, 0};
		int [] side = {100, 57, 70, 0};
		int [] dessert = {167, 266, 75, 0};
		
		System.out.println("Welcome	to	Chip’s	Fast Food Emporium");
		System.out.println("Enter a burger choice: ");
		calories += burger[sc.nextInt()];
		System.out.println("Enter a drink choice: ");
		calories += drink[sc.nextInt()];
		System.out.println("Enter a side choice: ");
		calories += side[sc.nextInt()];
		System.out.println("Enter a dessert choice: ");
		calories += dessert[sc.nextInt()];
		System.out.println("The total calorie count is " + calories);
		
		//QUESTION 3
		int a = sc.nextInt();
		int e = sc.nextInt();
		if (a >= 3 && e <= 4) {
			System.out.println("TroyMartian");
		}
		if (a <= 6 && e >= 2) {
			System.out.println("VladSaturnian");
		}
		if (a <= 2 && e <= 3) {
			System.out.println("GraemeMercurian");
		}
	}

}
