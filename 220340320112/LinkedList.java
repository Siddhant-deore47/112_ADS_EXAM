import java.util.Scanner;

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

class LinkedListOps {

	Node head;

	void insertNode(int data) {

		Node node = new Node(data);

		if(head == null) {
			head = node;
			return;
		}

		Node temp = head;

		while(temp.next != null) {
			temp = temp.next;
		}

		temp.next = node;
	}

	void reverse() {

		reverse(head);		
	}

	void reverse(Node head) {

		if(head == null)
			return;

		reverse(head.next);
		System.out.print(head.data + " ");
	}

	void display() {

		if(head == null) {
			System.out.println("Linked list is empty!");
			return;
		}

		Node temp = head;

		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class LinkedList {
	
	public static void main(String[] args) {

		LinkedListOps ll = new LinkedListOps();
		Scanner objSc = new Scanner(System.in);

		System.out.print("Enter number of elements in linked list: ");
		
		int n = objSc.nextInt();
		
		System.out.println("Enter elements in linked list: ");
		
		for(int i = 0; i < n; i++) {
			ll.insertNode(objSc.nextInt());
		}
		
		ll.reverse();
		

	}
}