package linkedLists;

public class NthNodeFromEnd {
	
	//Define a method that take int nodeNumber and SLL head as input and SLL as output
	public SLL findNthNodeFromEnd(int nodeNumber, SLL head){
		SLL current = head;
		SLL nthNode = head;
		int count = 0;
		
		if(current == null)
			return null;
		else{
			while(count != nodeNumber){
				//If length of node is shorter return null
				if(current == null)
					return null;
				current = current.getNext();
				count ++;
			}
			
			while(current!=null){
				current = current.getNext();
				nthNode = nthNode.getNext();
			}
			
			return nthNode;
		}
	}
	

	public static void main(String[] args) {
		//test 1 = empty node
		SLL nthNode = new NthNodeFromEnd().findNthNodeFromEnd(3, null);
		if(nthNode == null){
			System.out.println("null");
		}
		
		//test 2 = send n> ll length
		SLL ll = new SLL(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(5);
		
		nthNode = new NthNodeFromEnd().findNthNodeFromEnd(6, ll);
		if(nthNode == null){
			System.out.println("null");
		}
		
		//test 3= valid test nthnode < ll length
		nthNode = new NthNodeFromEnd().findNthNodeFromEnd(3, ll);
		System.out.println(nthNode.getData());
	}

}
