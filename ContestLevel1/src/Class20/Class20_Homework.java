package Class20;
import java.util.*;

public class Class20_Homework {

	public static String syllable(String str) {
		int index = -1;
		String strVowel = "aeiou";
		for (int i = str.length()-1; i>=0; i--) {
			if (strVowel.indexOf(str.charAt(i)) >= 0) {
				index = i;
				return str.substring(index);
			}
		}
		if (index == -1) {
			for (int i = str.length()-1; i >= 0; i--) {
				if (str.charAt(i) == ' ') {
					return str.substring(i+1);
				}
			}
		}
		return "";
	}
	public static void rhymeType(String [] arr) {
		if (arr[0].equals(arr[1]) && arr[1].equals(arr[2]) && arr[3].equals(arr[2])) {
			System.out.println("perfect");
		}
		else if (arr[0].equals(arr[1]) && arr[2].equals(arr[3])) {
			System.out.println("even");
		}
		else if (arr[0].equals(arr[2]) && arr[1].equals(arr[3])) {
			System.out.println("cross");
		}
		else if (arr[0].equals(arr[3]) && arr[2].equals(arr[1])) {
			System.out.println("shell");
		}
		else System.out.println("free");
	}
	public static int points (char[] arr) {
		int points = 0;
		if (arr.length == 1) points += 3;
		else if (arr.length == 2) points += 2;
		else if (arr.length == 3) points += 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'A') points += 4;
			else if (arr[i] == 'K') points += 3;
			else if (arr[i] == 'Q') points += 2;
			else if (arr[i] == 'J') points += 1;
		}
		return points;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Poetry S2
		int verse = sc.nextInt();
		String str = sc.nextLine();
		for (int j = 0; j < verse; j++) {
			String [] end = new String[4];
			for (int i = 0; i < 4; i++) {
				str = sc.nextLine();
				end[i] = syllable(str);
			}
			rhymeType(end);
		}

		// Keeping Score J3/S1
		String in = sc.nextLine();
		// Void = 3 pts, Singleton = 2 pts, Doubleton = 1 pt
		// A = 4 pts, K = 3 pts, Q = 2 pts, J = 1 pt
		String output = "Cards Dealt\t\t\tPoints";
		String suits = "CDHS";
		String cl = "",di = "",he= "",sp = "";
		char [] c, d, h, s;
		int sum = 0;
		int C = 0;
		int D = in.indexOf("D");
		int H = in.indexOf("H");
		int S = in.indexOf("S");
		c = new char[in.substring(0, in.indexOf("D")).length()];
		d = new char[in.substring(in.indexOf("D"), in.indexOf("H")).length()];
		h = new char[in.substring(in.indexOf("H"), in.indexOf("S")).length()];
		s = new char[in.substring(in.indexOf("S")).length()];
		int counter = 0;
		for (int i = 0; i < in.length(); i++) {
			if (suits.indexOf(in.charAt(i)) != -1) {
				if (in.charAt(i) == 'C') cl = "Clubs:";
				else if (in.charAt(i) == 'D') {
					di = "\nDiamonds:"; counter++;
				}
				else if (in.charAt(i) == 'H') {
					he = "\nHearts:";  counter++;
				}
				else {
					sp = "\nSpades:"; counter++;
				}
			}
			else {
				if (counter == 0) {
					cl += " " + in.charAt(i);
					c[i-C-1] = in.charAt(i);
				}
				else if (counter == 1) {
					di += " "+ in.charAt(i);
					d[i-D-1] = in.charAt(i);
				}
				else if (counter == 2) {
					he += " "+ in.charAt(i);
					h[i-H-1] = in.charAt(i);
				}
				else {
					sp += " "+ in.charAt(i);
					s[i-S-1] = in.charAt(i);
				}
			}
		}
		sum = points(s) + points(h) + points(d) + points(c);
		System.out.println(output);
		System.out.printf("%-35s", cl);
		System.out.printf("%3s" , points(c));
		System.out.printf("%-35s", di);
		System.out.printf("%4s" , points(d));
		System.out.printf("%-35s", he);
		System.out.printf("%4s" , points(h));
		System.out.printf("%-35s", sp);
		System.out.printf("%4s" , points(s));
		System.out.println();
		System.out.printf("%38s", "Total " + sum);
		// 38 spaces
		
	}

}
