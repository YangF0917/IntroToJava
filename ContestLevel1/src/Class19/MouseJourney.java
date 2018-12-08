package Class19;
import java.util.*;

public class MouseJourney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] pos = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				pos[i][j] = 1;
			}
		}
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 1) {
				for (int j = y; j < r; j++) {
					pos[0][j] = 0;
				}
			}
			else if (x == c) {
				
			}
			else if (y == 1) {
				
			}
			else if (y == r) {
				
			}
		}
	}

}
