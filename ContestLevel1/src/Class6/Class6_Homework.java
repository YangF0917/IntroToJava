package Class6;
import java.util.Scanner;
public class Class6_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Q1: Boring Business
		
		// Q2: MouseMove
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int xPos = 0;
		int yPos = 0;
		int deltaX = -1;
		int deltaY = -1;
		
		while (!(deltaX == 0 && deltaY == 0)) {
			deltaX = sc.nextInt();
			deltaY = sc.nextInt();
			if (xPos + deltaX <= a && xPos + deltaX >= 0) xPos += deltaX;
			else if (xPos + deltaX >= 0) xPos = a;
			else xPos = 0;
			if (yPos + deltaY <= b && yPos + deltaY >= 0) yPos += deltaY;
			else if (yPos + deltaY >= 0) yPos = b;
			else yPos = 0;
			if (!(deltaX == 0 && deltaY == 0)) {
			System.out.println(xPos +" "+yPos);
			}
		}
	}

}
