package linkedLists;

public class FindMiddleOfSLL {

	public static Object[] middleOfSLL(SLL head) {
		if (head == null)
			return null;

		Object object[] = new Object[2];

		if (head.getNext() == null) {
			object[0] = (Object) head;
			object[1] = (Object) 1;
			return object;
		}

		SLL slowPtr = head, fastPtr = head;
		int position = 1;

		while (fastPtr != null && fastPtr.getNext() != null) {
			fastPtr = fastPtr.getNext().getNext();
			if(fastPtr != null){
				position++;
				slowPtr = slowPtr.getNext();
			}
		}
		object[0] = (Object) slowPtr;
		object[1] = (Object) position;
		return object;
	}

	public static void main(String[] args) {

		// Test Case 1 - good input
		SLL ll = new SLL(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
		
		Object object[] = FindMiddleOfSLL.middleOfSLL(ll);
		SLL mid = (SLL)object[0];
		System.out.println("Data: "+mid.getData());
		System.out.println("Position: "+ (int) object[1]);
		
		// Test case 2
		ll = new SLL(1);
		object = FindMiddleOfSLL.middleOfSLL(ll);
		mid = (SLL)object[0];
		System.out.println("Data: "+mid.getData());
		System.out.println("Position: "+ (int) object[1]);
		
		// Test case 3
		ll = new SLL(1);
		ll.insertAtEnd(2);
		object = FindMiddleOfSLL.middleOfSLL(ll);
		mid = (SLL)object[0];
		System.out.println("Data: "+mid.getData());
		System.out.println("Position: "+ (int) object[1]);
	}

}
