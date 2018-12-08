package Class4;
import java.util.Scanner;
public class Class4_ASCIIValuesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		// .compareTo method returns a value less than 0 if the first String comes earlier
		char x1 = 'a';
		int y1 = (int)x1;
		// The ASCII value of x1 will be stored
		
		char x2 = (char)(y1+3);
		System.out.println(x2);
		// Shifting letters using ASCII
		
		String str1 = "APPLE";
		for (int i = 0; i < str1.length(); i++) {
			System.out.print((char)((int)str1.charAt(i) + 3));
		}
		System.out.println("");
		String str2 = "ZZYXA";
		for (int i = 0; i < str2.length(); i++) {
			if ((char)((int)str2.charAt(i) + 3) > (int)('A') + 25) {
				System.out.print((char)((int)str2.charAt(i) - 23));
			}
			else {
				System.out.print((char)((int)str2.charAt(i) + 3));
			}
		}
		System.out.println("");
	}
}
