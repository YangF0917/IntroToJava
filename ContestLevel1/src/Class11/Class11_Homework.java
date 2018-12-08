package Class11;
import java.util.*;
public class Class11_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Computer Purchase
		int n = sc.nextInt();
		String [] name = new String[n];
		int [] ram = new int[n];
		int [] cpu = new int[n];
		int [] dd = new int [n];
		
		int [] p = new int [n];
		
		for (int i = 0; i < n; i++) {
			name[i] = sc.next();
			ram[i] = sc.nextInt();
			cpu[i] = sc.nextInt();
			dd[i] = sc.nextInt();
			String temp = sc.nextLine();
			p[i] = 2 * ram[i] + 3*cpu[i] + dd[i];
		}
		if (n != 0) {
		if (n == 1) {
			System.out.println(name[0]);
		}
		int max1 = p[0];
		int imax1 = 0;
		int max2 = p[0];
		int imax2 = 0;
		if(n >= 2) {
		for (int i = 0; i < n; i++) {
			if (p[i] > max1) {
				max2 = max1;
				imax2 = imax1;
				max1 = p[i];
				imax1 = i;
			}
			else if (p[i] > max2) {
				max2 = p[i];
				imax2 = i;
			}
			else if (p[i] == max1) {
				if(name[i].compareTo(name[imax1]) < 0) {
					max2 = max1;
					imax2 = imax1;
					max1 = p[i];
					imax1 = i;
				}
			}
			else if (p[i] == max2) {
				if(name[i].compareTo(name[imax2]) < 0) {
					max2 = p[i];
					imax2 = i;	
				}
			}
		}
		System.out.println(name[imax1]);
		System.out.println(name[imax2]);
		}
	}
	}

}
