package linkedLists;

public class SLL {
	private int data;
	private SLL next;
	
	public SLL() {
		this.setNext(null);
	}
	
	public SLL(int input){
		this.setData(input);
		this.setNext(null);
	}
	
	public SLL(int input, SLL nextNode){
		this.setData(input);
		this.setNext(nextNode);
	}
	
	public void insertAtEnd(int input){
		SLL current = this;
		while(current.next != null)
			current = current.getNext();
		
		current.setNext(new SLL(input));
	}
	
	public void printSLL(){
		SLL current = this;
		while(current != null){
			System.out.print(current.data + "-->");
			current = current.getNext();
		}
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public SLL getNext() {
		return next;
	}

	public void setNext(SLL next) {
		this.next = next;
	}
	
}
