package Class1;
import java.util.Scanner;
public class Class1_SelectionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		boolean isHungry = false;
		boolean isThirsty = false;
		
		if (isHungry) {
			System.out.println("Eat");
		}
		else if (isThirsty) {
			System.out.println("Drink");
		}
		else {
			System.out.println("Not hungry or thirsty");
		}
		
		if (isHungry || isThirsty) {
			System.out.println("Go to the kitchen");
		}
	}

}
