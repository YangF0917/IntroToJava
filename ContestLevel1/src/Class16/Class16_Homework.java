package Class16;
import java.util.*;

import java.util.Scanner;
/**
 *
 * @author nanth
 */
public class Class16_Homework {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt ();
	Tree x = new Tree ();
	long sum = 0;
	for (int k = 1 ; k <= t ; k++)
	    sum += x.add (input.nextInt ()) + 1;
	double ans = (double) (sum) / t;
	System.out.println (ans);
    }
    
}
