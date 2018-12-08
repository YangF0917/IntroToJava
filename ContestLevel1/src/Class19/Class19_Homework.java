package Class19;
import java.util.*;
public class Class19_Homework {

	public static boolean AABDD(int a, int b, int c, int d) {
		if (a >= 2 && b >= 1 && d >= 2) return true;
		else return false;
	}
	public static boolean ABCD(int a, int b, int c, int d) {
		if (a >= 1 && b >= 1 && d >= 1 && c >= 1) return true;
		else return false;
	}
	public static boolean CCD(int a, int b, int c, int d) {
		if (c >= 2 && d >= 1) return true;
		else return false;
	}
	public static boolean BBB(int a, int b, int c, int d) {
		if (b >= 3) return true;
		else return false;
	}
	public static boolean AD(int a, int b, int c, int d) {
		if (a >= 1 && d >= 1) return true;
		else return false;
	}
	public static boolean canMove(int a, int b, int c, int d) {
		if (AABDD(a,b,c,d) || ABCD(a,b,c,d) || CCD(a,b,c,d) || BBB(a,b,c,d) || AD(a,b,c,d)) return true;
		else return false;
	}
	public static boolean losingCombo (int a, int b, int c, int d) {
		if (!canMove(a,b,c,d)) return true;
		else {
			boolean temp = true;
			if (AABDD(a,b,c,d)) temp = temp && winningCombo(a-2,b-1,c,d-2);
			else if (ABCD(a,b,c,d)) temp = temp && winningCombo(a-1,b-1,c-1,d-1);
			else if (CCD(a,b,c,d)) temp = temp && winningCombo(a,b,c-2,d-1);
			else if (BBB(a,b,c,d)) temp = temp && winningCombo(a,b-3,c,d);
			else if (AD(a,b,c,d)) temp = temp && winningCombo(a-1,b,c,d-1);
			return temp;
		}
	}
	public static boolean winningCombo(int a, int b, int c, int d) {
		if (AABDD(a,b,c,d) && losingCombo(a-2,b-1,c,d-2)) return true;
		else if (ABCD(a,b,c,d) && losingCombo(a-1,b-1,c-1,d-1)) return true;
		else if (CCD(a,b,c,d) && losingCombo(a,b,c-2,d-1)) return true;
		else if (BBB(a,b,c,d) && losingCombo(a,b-3,c,d)) return true;
		else if (AD(a,b,c,d) && losingCombo(a-1,b,c,d-1)) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// S5 Nukit
		
		// Reactions:
		/*
		 * AABDD
		 * ABCD
		 * CCD
		 * BBB
		 * AD
		 */
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if (winningCombo(a,b,c,d)) {
				System.out.println("Patrick");
			}
			else {
				System.out.println("Roland");
			}
		}
		
		// S2: TopYoddler
		int yodlers = sc.nextInt();
		int trials = sc.nextInt();
		
		int [] accScores = new int[yodlers];
		int [][] trialScores = new int[yodlers][trials];
		for (int i = 0; i < yodlers; i++) {
			accScores[i] = 0;
		}
		for (int i = 0; i < trials; i++) {
			for (int j = 0; j < yodlers; j++) {
				int a = sc.nextInt();
				trialScores[j][i] = a;
				accScores[j] += a;
			}
		}
		int maxIndex = 0;
		for (int i = 0; i < accScores.length; i++) {
			int max = Integer.MIN_VALUE;
			if (accScores[i] > max) {
				max = accScores[i];
				maxIndex = i;
			}
		}
		int worstRank = 0;
		for (int i = 0; i < trials; i++) {
			int counter = 0;
			for (int j = 0; j < yodlers; j++) {
				if (trialScores[j][i] < trialScores[maxIndex][i]) counter++;
			}
			if (worstRank < counter) worstRank = counter;
		}
		System.out.println("Yodler " + (maxIndex + 1) + " is the TopYodeller: score: "+ accScores[maxIndex] + "," + " worst rank " + (worstRank+1));		
	}

}
