package Class7;
import java.util.*;
public class Class7_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// FILO, First In, Last Out
		// Initializing a Stack
		Stack <Integer> stack1 = new Stack<Integer>();
		
		// Adding in an element
		stack1.add(1);
		stack1.add(4);
		stack1.add(3);
		stack1.add(2);
		
		// Peeking at the top of the Stack
		System.out.println(stack1.peek());
		
		// Popping off the top element of the stack
		stack1.pop();
		System.out.println(stack1.peek());
		
		// Pushing one element into the stack
		stack1.push(5);
		System.out.println(stack1.peek());
		
		// Size of the Stack
		System.out.println(stack1.size());
		
		// isEmpty
		System.out.println(stack1.isEmpty());
		
		// Printing out the entire stack
		System.out.println(stack1);
		for (int i = stack1.size(); i > 0; i--) System.out.println(stack1.pop());
		
	}

}
