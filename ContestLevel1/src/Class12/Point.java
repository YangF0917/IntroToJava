package Class12;
import java.util.*;
public class Point {

	private int x;
	private int y;
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
	// Accessor and Mutator Methods
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return x +", "+ y;
	}
}
