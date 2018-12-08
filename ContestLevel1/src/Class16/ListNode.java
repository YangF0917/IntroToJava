package Class16;
import java.util.*;
import java.io.*;
public class ListNode {
	int data;
	ListNode next;
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// Declaring a ListNode
		ListNode n1 = new ListNode(10);
		ListNode n2 = new ListNode(20);
		ListNode n3 = new ListNode(30);
		n1.next = n2;
		n2.next = n3;
		// Using only n1 to print the value stored in n2 and n3
		System.out.println(n1.next.data);
		System.out.println(n1.next.next.data);
		
		ListNode a = n1;
		while(a.data != 30) {
			a = a.next;
			System.out.println(a.data);
		}
	}

}
