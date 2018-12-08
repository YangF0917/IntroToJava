package Class12;
import java.util.*;
public class Class12_PointTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Declaring a Point object
		Point a = new Point(1, 2);
		System.out.println("a X-Coordinate: " + a.getX());
		Point b = new Point(1, -8);
		a.setX(35);
		a.setY(38);
		System.out.println("x: " + a.getX() + " y: " + a.getY());
		System.out.println(a.toString());
		
		// Storing objects in an Array
		Point [] arr = new Point[10];
		
		// Storing objects in an arraylist
		ArrayList <Point> arrL = new ArrayList<>();
		
		// For Loops
		for (int i = 0; i < 10; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			Point c = new Point(x,y);
			arr[i] = c;
			arrL.add(c);
		}
		
		// Printing
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i].toString());
			System.out.println(arrL.get(i).toString());
		}
	}

}
