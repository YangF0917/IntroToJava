package Class7;
import java.util.*;
public class Class7_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Problem 1: The Geneva Confection
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int curr = 1;
			Stack <Integer> mt = new Stack<Integer>();
			Stack <Integer> b = new Stack<Integer>();
			for (int j = 0; j < k; j++) {
				mt.push(sc.nextInt());
			}
			while (!mt.isEmpty()) {
			if (mt.peek() == curr) {
				mt.pop();
				curr++;
			}
			else{
				while (!mt.isEmpty() && mt.peek() != curr) {
				b.push(mt.pop());
				}
			}
			if (!b.isEmpty()) {
				while (!b.isEmpty() && b.peek() == curr) {
					b.pop(); 
					curr++;
				}
			}
		}
			if (curr == k+1) System.out.println("Y");
			else System.out.println("N");
	}
		// Problem 2: Zero That Out
		Stack<Integer> boss = new Stack<Integer>();
		int k = sc.nextInt();
		for (int i = 0; i < k; i++) {
			int a = sc.nextInt();
			if (a != 0) boss.push(a);
			else boss.pop();
		}
		int sum = 0;
		while (!boss.isEmpty()) sum += boss.pop();
		System.out.println(sum);
	}

}
