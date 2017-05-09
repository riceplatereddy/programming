package linkedLists;

public class ReverseSLL {
	
	public static SLL reverseSLL(SLL head){
		if(head == null){
			return null;
		}
		SLL reversedSLL = null;
		SLL current = head;
		
		while(head != null){
			current = head;
			head = head.getNext();
			current.setNext(reversedSLL);
			reversedSLL = current;
		}
		
		return reversedSLL;
	}
	
	public static void main(String[] args) {
		
		//Test Case 1 - good input
		SLL ll = new SLL(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
		
		System.out.println("Original Linked List");
		ll.printSLL();
		
		//Now reverse the SLL
		ll = ReverseSLL.reverseSLL(ll);
		System.out.println("\nReversed Linked List");
		ll.printSLL();
		
		//Test Case 2
		ll = ReverseSLL.reverseSLL(null);
		if(ll == null)
			System.out.println("\nnull");
		
		//Test case 3
		ll = new SLL(1);
		ll = ReverseSLL.reverseSLL(ll);
		System.out.println("\nReversed Linked List - only one node");
		ll.printSLL();
	}

}
