package Class16;
import java.util.*; // LinkedList, Queue, Scanner
public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> myQueue = new LinkedList<Integer>();
		
		// Queue Methods
		// Inserting an element
		for (int i = 0; i < 10; i++) {
			myQueue.add((int)(100 * Math.random()));
		}
		
		// Viewing the contents in the Queue
		System.out.println(myQueue);
		
		// Accessing the elements in the front of the Queue
		System.out.println(myQueue.peek());
		
		// Removing the first element in the Queue
		myQueue.remove();
		System.out.println(myQueue.peek());
		System.out.println(myQueue);
		
		for (int i = 0; i < 1; i++) {
			myQueue.add(sc.nextInt());
		}
		
		// Accessing the elements in separate lines
		while (!myQueue.isEmpty()) {
			System.out.println(myQueue.peek());
			myQueue.poll();
		}
		
		
	}

}
