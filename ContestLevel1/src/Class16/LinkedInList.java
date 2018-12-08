package Class16;
import java.util.*;
public class LinkedInList {
	public ListNode front;
	
	public LinkedInList() {
		front = null;
	}
	public void add (int value) {
		if (front == null) {
			front = new ListNode(value);
		}
		else {
			ListNode current = front;
			while(current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
