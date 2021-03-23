import java.util.*;

public class Linkedlist {
	private class Node{
		private int data;
		private Node next;
		public Node(int x) {
			this.data = x;
		}
	}
	private Node head;
	private Node last;
	
	
	public void addLast(int val) {
		var node = new Node(val);
		if(head == null) {
			head = last = node;
		}
		else {
			last.next=node;
			last = node;
		}
	}
	public void add_begin(int val) {
		Node node = new Node(val);
			node.data = val;
			node.next=head;
			head = node;
	}
	public void  printList() {
		Node itr = head;
		while(itr!=null) {
			System.out.println(itr.data);
			itr=itr.next;
		}
	}
	public static void main(String arhs[]) {
		Linkedlist list = new Linkedlist();
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			while(n-- >0) {
				list.addLast(sc.nextInt());
			}
		}
		list.printList();
	}
	public Node getLast() {
		return last;
	}
	public void setLast(Node last) {
		this.last = last;
	}
}
