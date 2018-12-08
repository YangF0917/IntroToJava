package CCCL1W18Test2;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int allBat = 0;
		int allSlug = 0;
		String output = "";
		String seasonName = sc.nextLine();
		output += seasonName + "\n";
		output += "====================" + "\n";
		for (int i = 0; i < 10; i++) {
			String team = sc.next();
			output += team + ":" + " ";
			int [] stats = new int [7];
			for (int j = 0; j < 7; j++) {
				stats[j] = sc.nextInt();
			}
			double batAvg = (double)stats[3] / stats[1];
			batAvg *= 1000;
			allBat += batAvg;
			double slugAvg = (double)(stats[3] + stats[4] + 2*stats[5] + 3*stats[6])/stats[1];
			slugAvg *= 1000;
			allSlug += slugAvg;
			output += "."+(int)batAvg + " " + "." + (int)slugAvg + "\n";
		}
		output += "====================" + "\n";
		output += "Big 10 Av: ." + allBat/10 + " ." + allSlug/10;
		System.out.println(output);
	}

}
