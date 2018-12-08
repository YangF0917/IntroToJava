package Class5;
import java.util.Scanner;
public class Class5_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Question 1: Do the Shuffle
		/*
		String mp3 = "ABCDE";
		String temp;
		
		int button = 0;
		int times = 0;
		
		while (button != 4) {
			button = sc.nextInt();
			times = sc.nextInt();
			if (button == 1) {
				for (int i = 0; i < times; i++) {
					temp = mp3.substring(1) + mp3.charAt(0);
					mp3 = temp;
				}
			}
			else if (button == 2) {
				for (int i = 0; i < times; i++) {
					temp = "" + mp3.charAt(4) + mp3.substring(0, 4);
					mp3 = temp;
				}
			}
			else if (button == 3) {
				for (int i = 0; i < times; i++) {
					temp = ""+ mp3.charAt(1) + mp3.charAt(0) + mp3.substring(2);
					mp3 = temp;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(mp3.charAt(i) + " ");
		}
		*/
		
		// Question 2: Returning Home
		String [] dir = new String[10];
		String [] location = new String[10];
		int index = 1;
		int i2 = 1;
		String str = sc.nextLine();
		dir[0] = str;
		String loc = "HOME";
		location[0] = sc.nextLine();
		while (!loc.equals("SCHOOL")) {
			str = sc.nextLine();
			loc = sc.nextLine();
			dir[i2] = str;
			location[index] = loc;
			index++;
			i2++;
		}
		for (int i = 9; i > 0; i--) {
			if (location[i] != null) {
				if (dir[i].equals("R")) {
				System.out.println("Turn LEFT onto " +location[i-1]+" street.");
			}
			else if (dir[i].equals("L")) {
				System.out.println("Turn RIGHT onto "+location[i-1]+" street.");
			}
		}
		}
		if (dir[0].equals("R")) System.out.println("Turn LEFT into your HOME.");
		else System.out.println("Turn RIGHT into your HOME.");
	}

}
