class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
	
}

class SLL{
	
	Node head;
	Node tail;
	
	
	void insert(int data){
		Node node = new Node(data);
		
		if(head==null){
			head = node;
			tail = node;
		}else{
			tail.next = node;
			tail = node;
		}
	}
	
	void printList(Node node){
		Node temp = node;
		if(temp == null){
			System.out.print("Null");
		}else{
			while(temp!= null){
				System.out.print(temp.data);
				temp = temp.next;
			}
		}
	}
}

class LinkedList{
	
	Node reverseList(Node head){
		
		Node next =null;
		Node tail = null;
		Node temp = head;
		
		while(temp! = null){
			
			next = temp.next;
			tail = temp;
			temp = next;
			
		}
		Node node = tail;
		return node;
	}
	
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int tests = sc.nextInt();
		
		for(int i = 0;i<tests;i++){
			SLL sll = new SLL();
			
			int cnt = sc.nextInt();
			
			for(int j = 0;j<cnt;i++){
				int data = sc.nextInt();
				sll.insert(data);
			}
			
			LinkedList ll = new LinkedList();
			Node node1 = ll.reverseList(sll.head);
			
			sll.printList(node1);
		}
		
		
	}
}